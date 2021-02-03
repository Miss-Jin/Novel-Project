package com.zzz.util;

import org.springframework.stereotype.Component;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
@Component
public class DownloadPicture {

    //提供图片Url和保存的地址和图片名字，即可下载图片
    public void downloadPicture(String url,String file,String name) throws Exception {
        String s = "https://www.biquge.cn";
        String finalUrl = s + url;
        URL url1 = new URL(finalUrl);
        URLConnection uc = url1.openConnection();
        InputStream inputStream = uc.getInputStream();

        FileOutputStream out = new FileOutputStream(file+"\\"+name+".jpg");
        int j = 0;
        while ((j = inputStream.read()) != -1) {
            out.write(j);
        }
        inputStream.close();
    }
}
