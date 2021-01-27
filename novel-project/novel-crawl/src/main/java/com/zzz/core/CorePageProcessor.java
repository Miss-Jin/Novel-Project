package com.zzz.core;

import org.springframework.stereotype.Component;
import us.codecraft.webmagic.*;
import us.codecraft.webmagic.processor.PageProcessor;

@Component
public class CorePageProcessor implements PageProcessor {
    //站点配置，编码gbk,重试3次
    public Site site = Site.me().setCharset("gbk").setRetryTimes(3);
    //抽取细节
    public void process(Page page) {
        //首页处理（抓取9类小说的下一链接地址）(测试成功)
        page.addTargetRequests(page.getHtml().css("div.nav a").links().regex("^.*//.*/.*/$").all());
        //处理9个连接点进去的下一个界面（选书）（测试成功）
        page.addTargetRequests(page.getHtml().css("div.r a").links().all());

        //处理书本目录页
        page.putField("name",page.getHtml().css("div#info h1")
                .replace("<h1>","")
                .replace("</h1>",""));

    }
    public Site getSite() {
        return site;
    }
}
