import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.pipeline.FilePipeline;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Selectable;

//测试获取一本书
public class CorePageProcessorTest implements PageProcessor {
    //站点配置，编码utf-8,重试3次
    public Site site = Site.me().setCharset("gbk").setRetryTimes(3);

    //处理细节
    public void process(Page page) {
        //首页处理（抓取9类小说的下一链接地址）(测试成功)
        page.addTargetRequests(page.getHtml().css("div.nav a").links().regex("^.*//.*/.*xuanhuan$").all());
        //处理9个连接点进去的下一个界面（选书）（测试成功）
//        page.addTargetRequests(page.getHtml().css("div.r a").links().all());
        page.putField("bookurl",page.getHtml().css("div.r a").links().all());

        //处理书本目录页
//        page.putField("name",page.getHtml().css("div#info h1")
//                .replace("<h1>","")
//                .replace("</h1>",""));

    }

    public Site getSite() {
        return site;
    }

    public static void main(String[] args) {
        Spider.create(new CorePageProcessorTest())
                .addUrl("https://www.biquge.cn/xuanhuan/")
                .thread(20)
                .run();
    }
}
