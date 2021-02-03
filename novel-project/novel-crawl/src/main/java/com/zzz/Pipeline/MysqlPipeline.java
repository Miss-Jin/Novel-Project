package com.zzz.Pipeline;

import com.zzz.entity.Book;
import com.zzz.entity.BookAuthor;
import com.zzz.entity.BookContent;
import com.zzz.entity.BookIndex;
import com.zzz.mapper.*;
import com.zzz.util.DownloadPicture;
import com.zzz.util.ProduceBean;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

import javax.annotation.PostConstruct;
import java.util.Optional;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

//把数据存入mysql
@Component
public class MysqlPipeline implements Pipeline {
    @Autowired
    private DownloadPicture downloadPicture;
    @Autowired
    private ProduceBean produceBean;
    @Autowired
    private BookAuthorMapper bookAuthorMapper;
    @Autowired
    private BookMapper bookMapper;
    @Autowired
    private BookIndexMapper bookIndexMapper;
    @Autowired
    private BookContentMapper bookContentMapper;
    @Autowired
    private BookAuthorDynamicSqlSupport bookAuthorDynamicSqlSupport;
    @Autowired
    private BookDynamicSqlSupport bookDynamicSqlSupport;
    @Autowired
    private BookIndexDynamicSqlSupport bookIndexDynamicSqlSupportl;
    @Autowired
    private BookContentDynamicSqlSupport bookContentDynamicSqlSupport;
    //解决@Autowired空指针异常
    private static MysqlPipeline mysqlPipeline; //1.加个所在类的静态变量
    @PostConstruct  //2.初始化需要的的组件（produceBean就是之前注入为空的组件）
    public void init() {
        mysqlPipeline = this;
        mysqlPipeline.produceBean = this.produceBean;
        mysqlPipeline.downloadPicture = this.downloadPicture;
        mysqlPipeline.bookMapper = this.bookMapper;
        mysqlPipeline.bookAuthorMapper = this.bookAuthorMapper;
        mysqlPipeline.bookIndexMapper = this.bookIndexMapper;
        mysqlPipeline.bookContentMapper = this.bookContentMapper;
        mysqlPipeline.bookDynamicSqlSupport = this.bookDynamicSqlSupport;
        mysqlPipeline.bookAuthorDynamicSqlSupport = this.bookAuthorDynamicSqlSupport;
        mysqlPipeline.bookIndexDynamicSqlSupportl = this.bookIndexDynamicSqlSupportl;
        mysqlPipeline.bookContentDynamicSqlSupport = this.bookContentDynamicSqlSupport;

    }
    @SneakyThrows
    @Override
    public void process(ResultItems resultItems, Task task) {
        Book book;
        BookAuthor bookAuthor;
        BookIndex bookIndex;
        //封装bean供mapper使用
        //一些特殊数据的处理
        //authorld:是否能在对应bookauthor表中找到相同笔名的作者，有则拿到它id，无就为空
//        Optional<BookAuthor> bookAuthor1 = mysqlPipeline.bookAuthorMapper.selectOne(c ->
//                c.where(mysqlPipeline.bookAuthorDynamicSqlSupport.penName,isEqualTo(resultItems.get("Book-authorName").toString())));
//                if(bookAuthor1.isPresent()){
//                    Long authorld = Long.valueOf(String.valueOf(bookAuthor1.get().getId()));
//                    book = mysqlPipeline.produceBean.getBook(resultItems.get("Book-workDirection"), null,
//                            resultItems.get("Book-catName"),
//                            resultItems.get("Book-picUrl"),
//                            resultItems.get("Book-bookName"),
//                            authorld,
//                            resultItems.get("Book-authorName"),
//                            resultItems.get("Book-bookDesc"),
//                            Float.parseFloat(resultItems.get("Book-score").toString()),
//                            resultItems.get("Book-bookStatus"),
//                            null,
//                            null,
//                            null,
//                            null,
//                            null,
//                            resultItems.get("Book-lastIndexName"),
//                            resultItems.get("Book-lastIndexUpdateTime"),
//                            null,
//                            null,
//                            resultItems.get("Book-updateTime"),
//                            resultItems.get("Book-createTime"),
//                            null,
//                            null,
//                            null,
//                            null);
//
//                    //操作数据库
//                    mysqlPipeline.bookMapper.insert(book);
//                    //把图片保存至本地文件夹
//                    mysqlPipeline.downloadPicture.downloadPicture(resultItems.get("Book-picUrl"),"E:\\novel-picture",resultItems.get("Book-bookName"));
//
//                }
//                else
//                {
                    //bookStatus连载、完结的1、0替换
                    Byte bookStatus = 0;
                    if(resultItems.get("Book-bookStatus") == "连载"){bookStatus = 0;}
                    else if(resultItems.get("Book-bookStatus") == "完结"){bookStatus = 1;}
                    //3.调用：本类.注入类
                    book = mysqlPipeline.produceBean.getBook(resultItems.get("Book-workDirection"),
                            null,
                            resultItems.get("Book-catName"),
                            "E:\\novel-picture\\"+resultItems.get("Book-bookName")+".jpg",
                            resultItems.get("Book-bookName"),
                            null,
                            resultItems.get("Book-authorName"),
                            resultItems.get("Book-bookDesc"),
                            resultItems.get("Book-score"),
                            bookStatus,
                            null,
                            null,
                            null,
                            null,
                            null,
                            resultItems.get("Book-lastIndexName"),
                            resultItems.get("Book-lastIndexUpdateTime"),
                            null,
                            null,
                            resultItems.get("Book-updateTime"),
                            resultItems.get("Book-createTime"),
                            null,
                            null,
                            null,
                            null
                            );

                    //操作数据库
                    mysqlPipeline.bookMapper.insert(book);
                    //把图片保存至本地文件夹
                    mysqlPipeline.downloadPicture.downloadPicture(resultItems.get("Book-picUrl"),"E:\\novel-picture",resultItems.get("Book-bookName"));
//                }



                bookAuthor = mysqlPipeline.produceBean.getBookAuthor(null,
                resultItems.get("BookAuthor-penName"),
                null,
                null,
                null,
                resultItems.get("BookAuthor-workDirection"),
                null,
                resultItems.get("BookAuthor-createTime"),
                null,
                resultItems.get("BookAuthor-updateTime"),
                null);

            //操作数据库
            mysqlPipeline.bookAuthorMapper.insert(bookAuthor);

                //根据Book-bookName查询Book表，把book表的id作为索引表bookid字段的值
//        Optional<Book> book2 = mysqlPipeline.bookMapper.selectOne(c ->
//                c.where(mysqlPipeline.bookDynamicSqlSupport.bookName, isEqualTo(resultItems.get("Book-bookName").toString())));
//        if(book2.isPresent())
//        {
//                    bookIndex = mysqlPipeline.produceBean.getBookIndex(book2.get().getId(),
//                    resultItems.get("BookIndex-indexNum"),
//                    resultItems.get("BookIndex-indexName"),
//                    null,
//                    null,
//                    null,
//                    resultItems.get("BookIndex-createTime"),
//                    resultItems.get("BookIndex-updateTime"));
//
//                    //操作数据库
//                    mysqlPipeline.bookIndexMapper.insert(bookIndex);
//
//        }
//        else
//        {
//                    bookIndex = mysqlPipeline.produceBean.getBookIndex(null,
//                    resultItems.get("BookIndex-indexNum"),
//                    resultItems.get("BookIndex-indexName"),
//                    null,
//                    null,
//                    null,
//                    resultItems.get("BookIndex-createTime"),
//                    resultItems.get("BookIndex-updateTime"));
//
//                    //操作数据库
//                    mysqlPipeline.bookIndexMapper.insert(bookIndex);
//        }


    }
}
