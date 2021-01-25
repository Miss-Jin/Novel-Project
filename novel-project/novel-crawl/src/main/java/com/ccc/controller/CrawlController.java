package com.ccc.controller;

import com.ccc.core.CorePageProcessor;
import us.codecraft.webmagic.Spider;

//爬虫控制器
public class CrawlController {
    //开始爬取
    public void startCrawler(){
        Spider.create(new CorePageProcessor())
                .addUrl("https://www.biquge.cn/")
                .thread(5)
                .run();
    }
    //结束
    public void stopCrawler(){
    }

}
