package com.ccc.core;

import us.codecraft.webmagic.*;
import us.codecraft.webmagic.processor.PageProcessor;

public class CorePageProcessor implements PageProcessor {
    //站点配置，编码utf-8,重试3次
    public Site site = Site.me().setCharset("utf-8").setRetryTimes(3);

    //处理细节
    public void process(Page page) {
        //首页处理（抓取9类小说的下一链接地址）
        page.addTargetRequests(page.getHtml().css("div.nav a").links().regex("^.*//.*/.*/$").all());

    }



    public Site getSite() {
        return site;
    }

}
