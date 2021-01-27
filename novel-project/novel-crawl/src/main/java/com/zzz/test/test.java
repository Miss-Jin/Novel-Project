package com.zzz.test;

import com.zzz.Pipeline.MyConsolePipeline;
import com.zzz.controller.CrawlController;
import com.zzz.core.CorePageProcessor;
import org.springframework.beans.factory.annotation.Autowired;

public class test {
    @Autowired
    CrawlController crawlController;

    @Autowired
    CorePageProcessor corePageProcessor;

    @Autowired
    MyConsolePipeline myConsolePipeline;


    public void test(){
        crawlController.startCrawler();
    }

    public static void main(String[] args) {
        test test = new test();
        test.test();
    }


}
