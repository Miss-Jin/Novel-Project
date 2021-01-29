package com.zzz.controller;

import com.zzz.core.CorePageProcessor;
import com.zzz.core.CorePageProcessorTest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.pipeline.FilePipeline;

//爬虫控制器
@Controller
public class CrawlController {
    //开始爬取
    public void startCrawler(){
        Spider.create(new CorePageProcessor())
                .addUrl("https://www.biquge.cn/xuanhuan/")
                .thread(10)
                .run();
    }
    //结束
    public void stopCrawler(){
    }

    @ResponseBody
    @GetMapping("/hello")
    public void hello(){
        startCrawler();

    }

}
