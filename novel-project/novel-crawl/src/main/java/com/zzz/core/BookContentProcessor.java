package com.zzz.core;

import com.zzz.Pipeline.BookContentPipeline;
import com.zzz.entity.Book;
import com.zzz.entity.BookContent;
import com.zzz.mapper.BookContentDynamicSqlSupport;
import com.zzz.mapper.BookContentMapper;
import com.zzz.mapper.BookDynamicSqlSupport;
import com.zzz.mapper.BookMapper;
import com.zzz.util.ProduceBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

import javax.annotation.PostConstruct;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;
@Component
public class BookContentProcessor implements PageProcessor {
    @Autowired
    ProduceBean produceBean;
    @Autowired
    private BookMapper bookMapper;
    @Autowired
    private BookContentMapper bookContentMapper;
    @Autowired
    private BookDynamicSqlSupport bookDynamicSqlSupport;
    @Autowired
    private BookContentDynamicSqlSupport bookContentDynamicSqlSupport;
    //解决@Autowired空指针异常
    private static BookContentProcessor bookContentProcessor; //1.加个所在类的静态变量
    @PostConstruct  //2.初始化需要的的组件（produceBean就是之前注入为空的组件）
    public void init() {
        bookContentProcessor = this;
        bookContentProcessor.produceBean = this.produceBean;
        bookContentProcessor.bookMapper = this.bookMapper;
        bookContentProcessor.bookContentMapper = this.bookContentMapper;
        bookContentProcessor.bookDynamicSqlSupport = this.bookDynamicSqlSupport;
        bookContentProcessor.bookContentDynamicSqlSupport = this.bookContentDynamicSqlSupport;

    }
    String BookContent_bookname = "";
    //站点配置，编码utf-8,重试3次
    public Site site = Site.me().setCharset("gbk").setRetryTimes(5).setCycleRetryTimes(3);
    @Override
    public void process(Page page) {

        //如果是正文页面则爬取，不是正文页面就不管
        if (!(page.getHtml().css("div.page_chapter a").links().all().isEmpty()))
        {
            //正文页面处理
            //获取此正文的书名，根据书本确定属于哪本书
            String pattern = "<a .*?href=['\"](.*?)['\"].*?>(.*?)</a>";
            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(page.getHtml().css("div.p a").all().get(1));
            if (m.find( ))
            {

                StringBuffer sb = new StringBuffer(m.group(2));
                StringBuffer res = sb.reverse();
                StringBuffer res1 = new StringBuffer(res.substring(4,res.length()));
                BookContent_bookname = res1.reverse().toString();
            }
//            page.putField("BookContent-bookname",BookContent_bookname);
//            page.putField("BookContent-content",page.getHtml().css("div#content").replace("<div id=\"content\" class=\"showtxt\">","").replace("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;","").replace("<br />","").replace("</div>","").replace("<br>",""));

            //因为空指针的原因，直接在processor中将数据处理存入数据库------------------------------------------
            //根据BookContent-bookname查询Book表，把book表的id作为BookContent表id字段的值
            Optional<Book> book1 = bookContentProcessor.bookMapper.selectOne(c ->
                    c.where(bookContentProcessor.bookDynamicSqlSupport.bookName, isEqualTo(BookContent_bookname)));

                if(book1.isPresent())
                {
                    System.out.println("----------------------------对应bookid存在---------------------------");
                    //原先没有这个bookid就插入，原先有就更新
                    Long bookid = book1.get().getId();
                    Optional<BookContent> bookContent1 = bookContentProcessor.bookContentMapper.selectByPrimaryKey(bookid);

                    if(bookContent1.isPresent()){
                        //存在，更新
                        //老加新后生成的正文
                        System.out.println("----------------------------开始生成新正文---------------------------");
                        String oldContent = bookContent1.get().getContent();
                        Long indexId = bookContent1.get().getIndexId();
                        String newContent = oldContent+"&--&--&"+page.getHtml().css("div#content").replace("<div id=\"content\" class=\"showtxt\">","").replace("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;","").replace("<br />","").replace("</div>","").replace("<br>","");
                        bookContentProcessor.bookContentMapper.updateByPrimaryKeySelective(new ProduceBean().getBookContent(bookid,indexId,newContent));
                        System.out.println("----------------------------追加成功---------------------------");
                    }
                    else if(!bookContent1.isPresent())
                    {
                        //不存在，插入
                        Long indexid = 1L;
                        String firstContent = "&--&--&"+page.getHtml().css("div#content").replace("<div id=\"content\" class=\"showtxt\">","").replace("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;","").replace("<br />","").replace("</div>","").replace("<br>","");
                        bookContentProcessor.bookContentMapper.insert(new ProduceBean().getBookContent(bookid,indexid,firstContent));
                        System.out.println("----------------------------创建成功---------------------------");
                    }
                }
                else
                {
                    System.out.println("---------------------------------"+BookContent_bookname+"不存在-----------------------------------------");
                }

        }
        page.addTargetRequests(page.getHtml().css("div.nav a").links().regex("^.*//.*/.*/$").all());
        page.addTargetRequests(page.getHtml().css("div.r a").links().all());
        page.addTargetRequests(page.getHtml().css("div.listmain a").links().all());
    }



    @Override
    public Site getSite() {
        return site;
    }
}
