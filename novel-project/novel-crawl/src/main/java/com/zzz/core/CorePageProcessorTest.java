package com.zzz.core;

import com.zzz.Service.ProduceBean;
import com.zzz.entity.*;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class CorePageProcessorTest implements PageProcessor {
    @Autowired
    ProduceBean produceBean;
    //站点配置，编码utf-8,重试3次
    public Site site = Site.me().setCharset("gbk").setRetryTimes(3);

    //处理细节
    @SneakyThrows
    public void process(Page page) {
        //首页处理（抓取9类小说的下一链接地址）(测试成功)
//        page.addTargetRequests(page.getHtml().css("div.nav a").links().regex("^.*//.*/.*xuanhuan$").all());
        //处理9个连接点进去的下一个界面（选书）（测试成功）
//        page.addTargetRequests(page.getHtml().css("div.r a").links().all());
//        page.putField("bookurl",page.getHtml().css("div.r a").links().all());

        //获取书本链接（首页特有），章节链接（书本简介页特有），下一章链接（书本正文页特有）
        List<String> bookUrls = page.getHtml().css("div.r a").links().all();
        List<String> chapters = page.getHtml().css("div.listmain a").links().all();
        List<String> nextUrl = page.getHtml().css("div.page_chapter a").links().all();
        //书本链接存在，就把链接放到待抓取队列/章节链接存在，就把链接放入队列，并抓取信息/下一章链接存在，就抓取信息
        if(!bookUrls.isEmpty())
        {
            //首页处理
            page.addTargetRequests(bookUrls);
        }
        else if (!chapters.isEmpty())
        {
            //创建时间或者更新时间
            Date date = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            date = formatter.parse(formatter.format(date));
            Date createTime = date;
            Date updateTime = date;

            //book-男频女频
            Byte workDirection;
            if(Math.random() >=0.5){workDirection = 1;}
            else{workDirection = 0;}

            //分类ID（book的catID属性和）
            //书本目录页处理
            page.addTargetRequests(chapters);
            //这里暂时都存起来，在PipeLine页判断数据库是否已存在，只需要一次的就丢弃，正文则追加
//            Book book = produceBean.getBook(workDirection,);
//            BookAuthor bookAuthor = produceBean.getBookAuthor();
//            BookCategory bookCategory = produceBean.getBookCategory();
//            BookComment bookComment = produceBean.getBookComment();
//            BookCommentReply bookCommentReply = produceBean.getBookCommentReply();
//            BookIndex bookIndex = produceBean.getBookIndex();
//            BookScreenBullet bookScreenBullet = produceBean.getBookScreenBullet();
//            BookSetting bookSetting = produceBean.getBookSetting();

        }
        else if(!nextUrl.isEmpty())
        {
            //正文页处理
//            BookContent bookContent = produceBean.getBookContent();
        }
    }


    public Site getSite() {
        return site;
    }

}
