package com.zzz.controller;

import com.zzz.Pipeline.BookContentPipeline;
import com.zzz.Pipeline.MysqlPipeline;
import com.zzz.core.BookContentProcessor;
import com.zzz.core.BookIndexProcessor;
import com.zzz.core.CorePageProcessor;
import com.zzz.core.CorePageProcessorTest;
import com.zzz.entity.Book;
import com.zzz.entity.BookAuthor;
import com.zzz.mapper.BookAuthorDynamicSqlSupport;
import com.zzz.mapper.BookAuthorMapper;
import com.zzz.mapper.BookDynamicSqlSupport;
import com.zzz.mapper.BookMapper;
import com.zzz.util.ProduceBean;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.QueryExpressionDSL;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.pipeline.ConsolePipeline;
import us.codecraft.webmagic.pipeline.FilePipeline;
import us.codecraft.webmagic.pipeline.Pipeline;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.scheduler.BloomFilterDuplicateRemover;
import us.codecraft.webmagic.scheduler.QueueScheduler;
import us.codecraft.webmagic.scheduler.Scheduler;

import static org.mybatis.dynamic.sql.SqlBuilder.*;


import java.util.Optional;

//爬虫控制器
@Controller
public class CrawlController {
    @Autowired
    ProduceBean produceBean;
    @Autowired
    BookMapper bookMapper;
    @Autowired
    BookAuthorDynamicSqlSupport bookAuthorDynamicSqlSupport;
    @Autowired
    BookDynamicSqlSupport bookDynamicSqlSupport;
    //开始爬取
    public void startCrawler(PageProcessor pageProcessor, String url,
                             Pipeline pipeline, int threadCount, Scheduler scheduler){
        Spider.create(pageProcessor)
                .addUrl(url)
                .addPipeline(pipeline)
                .thread(threadCount)
                .setScheduler(scheduler)
                .run();
    }
    //结束
    public void stopCrawler(){
    }

    //爬取book表和bookautother表
    @ResponseBody
    @GetMapping("/hello1")
    public String hello(){
        startCrawler(new CorePageProcessorTest(),
                "https://www.biquge.cn/xuanhuan/",
                new MysqlPipeline(),
                30,
                new QueueScheduler());
        return "爬取完毕！".toString();
    }


    //爬取bookIndex表
    @ResponseBody
    @GetMapping("/hello2")
    public String hello2(){
        Spider.create(new BookIndexProcessor())
                .addUrl("https://www.biquge.cn/xuanhuan/")
                .addPipeline(new ConsolePipeline())
                .thread(5)
                .setScheduler(new QueueScheduler().setDuplicateRemover(new BloomFilterDuplicateRemover(10000000)))
                .run();
        return "爬取完毕！".toString();
    }

    //爬取bookContent表
    @ResponseBody
    @GetMapping("/hello3")
    public String hello3(){
        Spider.create(new BookContentProcessor())
                .addUrl("https://www.biquge.cn/xuanhuan/")
                .addPipeline(new ConsolePipeline())
                .thread(30)
                .setScheduler(new QueueScheduler().setDuplicateRemover(new BloomFilterDuplicateRemover(10000000)))
                .run();
        return "爬取完毕！".toString();
    }

    @ResponseBody
    @GetMapping("/test")
    public String date(){
        Optional<Book> book1 = bookMapper.selectOne(c ->
                c.where(bookDynamicSqlSupport.bookName, isEqualTo("圣霆".toString())));
        return book1.get().getAuthorName();
    }
}



