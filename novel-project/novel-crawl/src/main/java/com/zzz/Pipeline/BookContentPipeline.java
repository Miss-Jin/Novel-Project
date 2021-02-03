package com.zzz.Pipeline;

import com.zzz.entity.Book;
import com.zzz.entity.BookContent;
import com.zzz.mapper.*;
import com.zzz.util.DownloadPicture;
import com.zzz.util.ProduceBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

import javax.annotation.PostConstruct;
import java.util.Optional;

import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;
@Component
public class BookContentPipeline implements Pipeline {
    @Autowired
    private ProduceBean produceBean;
    @Autowired
    private BookMapper bookMapper;
    @Autowired
    private BookContentMapper bookContentMapper;
    @Autowired
    private BookDynamicSqlSupport bookDynamicSqlSupport;
    @Autowired
    private BookContentDynamicSqlSupport bookContentDynamicSqlSupport;
    //解决@Autowired空指针异常
    private static BookContentPipeline bookContentPipeline; //1.加个所在类的静态变量
    @PostConstruct  //2.初始化需要的的组件（produceBean就是之前注入为空的组件）
    public void init() {
        bookContentPipeline = this;
        bookContentPipeline.produceBean = this.produceBean;
        bookContentPipeline.bookMapper = this.bookMapper;
        bookContentPipeline.bookContentMapper = this.bookContentMapper;
        bookContentPipeline.bookDynamicSqlSupport = this.bookDynamicSqlSupport;
        bookContentPipeline.bookContentDynamicSqlSupport = this.bookContentDynamicSqlSupport;

    }
    @Override
    public void process(ResultItems resultItems, Task task) {
        //
        BookDynamicSqlSupport bookDynamicSqlSupport1 = new BookDynamicSqlSupport();
//        BookContentDynamicSqlSupport bookContentDynamicSqlSupport1 = new BookContentDynamicSqlSupport();
        //根据BookContent-bookname查询Book表，把book表的id作为BookContent表id字段的值
        Optional<Book> book1 = bookContentPipeline.bookMapper.selectOne(c ->
                c.where(bookDynamicSqlSupport1.bookName, isEqualTo(resultItems.get("BookContent-bookname").toString())));
        try{
            if(book1.isPresent())
            {
                //原先没有这个bookid就插入，原先有就更新
                Long bookid = book1.get().getId();
                Optional<BookContent> bookContent1 = bookContentPipeline.bookContentMapper.selectByPrimaryKey(bookid);

                if(bookContent1.isPresent()){
                    //存在，更新
                    //老加新后生成的正文
                    String oldContent = bookContent1.get().getContent();
                    Long indexId = bookContent1.get().getIndexId();
                    String newContent = oldContent+"&--&--&"+resultItems.get("BookContent-content");
                    bookContentPipeline.bookContentMapper.updateByPrimaryKeySelective(new ProduceBean().getBookContent(bookid,indexId,newContent));
                }
                else if(!bookContent1.isPresent())
                {
                    //不存在，插入
                    Long indexid = 1L;
                    String firstContent = "&--&--&"+resultItems.get("BookContent-content");
                    bookContentPipeline.bookContentMapper.insert(new ProduceBean().getBookContent(bookid,indexid,firstContent));
                }

            }
        }
        catch (Exception e)
        {
            System.out.println("根据BookContent-bookname找不到book表中的id");
        }
    }
}
