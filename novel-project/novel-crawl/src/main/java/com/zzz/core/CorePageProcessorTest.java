package com.zzz.core;

import com.zzz.util.ProduceBean;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CorePageProcessorTest implements PageProcessor {
    @Autowired
    ProduceBean produceBean;
    //站点配置，编码utf-8,重试3次
    public Site site = Site.me().setCharset("gbk").setRetryTimes(5).setCycleRetryTimes(3);

    //处理细节
    @SneakyThrows
    public void process(Page page) {
        //首页处理（抓取9类小说的下一链接地址）(测试成功)
//        page.addTargetRequests(page.getHtml().css("div.nav a").links().regex("^.*//.*/.*xuanhuan$").all());
        //处理9个连接点进去的下一个界面（选书）（测试成功）
//        page.addTargetRequests(page.getHtml().css("div.r a").links().all());
//        page.putField("bookurl",page.getHtml().css("div.r a").links().all());

        //获取9类小说链接,获取所有书本链接（首页特有），获取所有章节链接（书本简介页特有）----获取所有链接
        page.addTargetRequests(page.getHtml().css("div.nav a").links().regex("^.*//.*/.*/$").all());
        page.addTargetRequests(page.getHtml().css("div.r a").links().all());
//        page.addTargetRequests(page.getHtml().css("div.listmain a").links().all());
        //章节链接存在，就把链接放入队列，并抓取信息/下一章链接存在，就抓取信息----不同页面处理逻辑
        //bookname用于pipeline查询此章属于哪本书，以便存储
        String BookContent_bookname = "";
        if(!(page.getHtml().css("div.listmain a").links().all().isEmpty()))
        {
            //章节页面处理(把所有数据存到ResultItems,Pipeline之后处理)
            //book-男频女频（随机）
            Byte workDirection;
            if(Math.random() >=0.5){workDirection = 1;}
            else{workDirection = 0;}
            //图片地址前缀
            String picurl = "https://www.biquge.cn";
            //随机评分
            float score = (float) Math.floor((Math.random()*100)+1);
            //创建时间或者更新时间
            Date date = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("YYYY-MM-DD HH:MM:SS");
            date = formatter.parse(formatter.format(date));
            Date createTime = date;
            Date updateTime = date;
            Date Book_lastIndexUpdateTime = formatter.parse(page.getHtml().css("div#info p").all().get(5).replace("<p>最后更新：","").replace("</p>",""));

            //存数据
                //最新章节提取文字
            String BooklastIndexName = "";
            String pattern1 = "<a .*?href=['\"](.*?)['\"].*?>(.*?)</a>";
            Pattern r1 = Pattern.compile(pattern1);
            Matcher m1 = r1.matcher(page.getHtml().css("div#info p").all().get(4).replace("<p>最新章节：","").replace("</p>",""));
            if(m1.find()){BooklastIndexName = m1.group(2);}
            page.putField("Book-workDirection",workDirection);
            page.putField("Book-catName",page.getHtml().css("div#info p").toString().replace("<p>分类：","").replace("</p>",""));
            page.putField("Book-picUrl",page.getHtml().css("div#maininfo img").toString().replace("<img alt=\"我哥是主角\" src=\"","").replace("\" width=\"120\" height=\"150\" onerror=\"this.src='/images/nocover.jpg'\">","").replace("<img alt=\""+page.getHtml().css("div#info h1").toString().replace("<h1>","").replace("</h1>","")+"\" src=\"",""));
            page.putField("Book-bookName",page.getHtml().css("div#info h1").toString().replace("<h1>","").replace("</h1>",""));
            page.putField("Book-authorName",page.getHtml().css("div#info p").all().get(2).replace("<p>作&nbsp;&nbsp;&nbsp;&nbsp;者：","").replace("</p>",""));
            page.putField("Book-bookDesc",page.getHtml().css("div#intro p").toString().replace("<p> ","").replace("</p>",""));
            page.putField("Book-score",score);
            page.putField("Book-bookStatus",page.getHtml().css("div#info p").all().get(1).replace("<p>状&nbsp;&nbsp;&nbsp;&nbsp;态：","").replace("</p>",""));
            page.putField("Book-createTime",createTime);
            page.putField("Book-updateTime",updateTime);
            page.putField("Book-lastIndexName",BooklastIndexName);

            page.putField("Book-lastIndexUpdateTime",Book_lastIndexUpdateTime);

            page.putField("BookAuthor-penName",page.getHtml().css("div#info p").all().get(2).replace("<p>作&nbsp;&nbsp;&nbsp;&nbsp;者：","").replace("</p>",""));
            page.putField("BookAuthor-workDirection",workDirection);
            page.putField("BookAuthor-createTime",createTime);
            page.putField("BookAuthor-updateTime",updateTime);

            page.putField("BookCategory-workDirection",workDirection);
            page.putField("BookCategory-name",page.getHtml().css("div#info p").toString().replace("<p>分类：","").replace("</p>",""));
            page.putField("BookCategory-createTime",createTime);
            page.putField("BookCategory-updateTime",updateTime);

            page.putField("BookComment-updateTime",updateTime);

            page.putField("BookIndex-indexNum",Integer.valueOf("1"));
            //章节标题连成一个字符串，用&隔开区分
            String BookIndexindexName = "&";
            List<String> all = page.getHtml().css("div.listmain dd").all();
            String pattern = "<a .*?href=['\"](.*?)['\"].*?>(.*?)</a>";
            Pattern r = Pattern.compile(pattern);
            for (String x : all) {
                Matcher m = r.matcher(x);
                if (m.find( )) {BookIndexindexName += m.group(2)+"&";};
            }
            page.putField("BookIndex-indexName",BookIndexindexName);
            page.putField("BookIndex-createTime",createTime);
            page.putField("BookIndex-updateTime",updateTime);

        }
//        else if (!(page.getHtml().css("div.page_chapter a").links().all().isEmpty()))
//        {
//            //正文页面处理
//            String pattern = "<a .*?href=['\"](.*?)['\"].*?>(.*?)</a>";
//            Pattern r = Pattern.compile(pattern);
//                Matcher m = r.matcher(page.getHtml().css("div.p a").all().get(1));
//                if (m.find( ))
//                {
//                    StringBuffer sb = new StringBuffer(m.group(2));
//                    StringBuffer res = sb.reverse();
//                    res.substring(6,res.length()-1);
//                    BookContent_bookname = res.reverse().toString();
//                }
//            page.putField("BookContent-bookname",BookContent_bookname);
//            page.putField("BookContent-content",page.getHtml().css("div#content").replace("<div id=\"content\" class=\"showtxt\">","").replace("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;","").replace("<br />","").replace("</div>","").replace("<br>",""));
//            }

        }
    public Site getSite() {
        return site;
    }

}
