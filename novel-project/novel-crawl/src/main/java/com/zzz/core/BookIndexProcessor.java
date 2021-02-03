package com.zzz.core;

import com.zzz.entity.Book;
import com.zzz.entity.BookIndex;
import com.zzz.mapper.*;
import com.zzz.util.ProduceBean;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

import javax.annotation.PostConstruct;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;
@Component
public class BookIndexProcessor implements PageProcessor {
    @Autowired
    ProduceBean produceBean;
    @Autowired
    private BookMapper bookMapper;
    @Autowired
    private BookIndexMapper bookIndexMapper;
    @Autowired
    private BookIndex bookIndex;
    @Autowired
    private BookDynamicSqlSupport bookDynamicSqlSupport;
    @Autowired
    private BookIndexDynamicSqlSupport bookIndexDynamicSqlSupport;
    //解决@Autowired空指针异常
    private static BookIndexProcessor BookIndexProcessor; //1.加个所在类的静态变量
    @PostConstruct  //2.初始化需要的的组件（produceBean就是之前注入为空的组件）
    public void init() {
        BookIndexProcessor = this;
        BookIndexProcessor.produceBean = this.produceBean;
        BookIndexProcessor.bookMapper = this.bookMapper;
        BookIndexProcessor.bookIndex = this.bookIndex;
        BookIndexProcessor.bookDynamicSqlSupport = this.bookDynamicSqlSupport;
        BookIndexProcessor.bookIndexDynamicSqlSupport = this.bookIndexDynamicSqlSupport;
    }
    public Site site = Site.me().setCharset("gbk").setRetryTimes(5).setCycleRetryTimes(3);

    @SneakyThrows
    @Override
    public void process(Page page) {

        if(!(page.getHtml().css("div.listmain a").links().all().isEmpty()))
        {
            //1.串联每个目录制作indexName字段
            String BookIndexindexName = "&";
            List<String> all = page.getHtml().css("div.listmain dd").all();
            String pattern = "<a .*?href=['\"](.*?)['\"].*?>(.*?)</a>";
            Pattern r = Pattern.compile(pattern);
            for (String x : all) {
                Matcher m = r.matcher(x);
                if (m.find( )) {BookIndexindexName += m.group(2)+"&";};
            }

            //2.根据Book-bookName查询Book表，把book表的id作为索引表bookid字段的值
            Optional<Book> book2 = BookIndexProcessor.bookMapper.selectOne(c ->
                    c.where(BookIndexProcessor.bookDynamicSqlSupport.bookName, isEqualTo((page.getHtml().css("div#info h1").toString().replace("<h1>","").replace("</h1>","")).toString())));
            if(book2.isPresent())
            {
                System.out.println("-----------------------查询的Bookid存在---------------------");
                //3.加入创建和更新的时间字段
                Date date = new Date();
                SimpleDateFormat formatter = new SimpleDateFormat("YYYY-MM-DD HH:MM:SS");
                date = formatter.parse(formatter.format(date));
                Date createTime = date;
                Date updateTime = date;
                System.out.println("-----------------------创建时间字段成功---------------------");
                //4.生成bean
                bookIndex = BookIndexProcessor.produceBean.getBookIndex(book2.get().getId(),
                        Integer.valueOf("1"),
                        BookIndexindexName,
                        null,
                        null,
                        null,
                        createTime,
                        updateTime);
                System.out.println("-----------------------bean已经生成--------------------");
                //5.操作数据库
                BookIndexProcessor.bookIndexMapper.insert(bookIndex);
                System.out.println("-----------------------插入成功---------------------");

            }
            else
            {
                System.out.println("------------------此目录对应的书本不存在！------------------");
            }
        }
        page.addTargetRequests(page.getHtml().css("div.nav a").links().regex("^.*//.*/.*/$").all());
        page.addTargetRequests(page.getHtml().css("div.r a").links().all());
    }


    @Override
    public Site getSite() {
        return site;
    }
}
