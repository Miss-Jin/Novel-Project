package com.zzz.util;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class DownloadPicture {

    //提供图片Url和保存的地址和图片名字，即可下载图片
    public void downloadPicture(String url,String file,String name) throws Exception {
        URL url1 = new URL(url);
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
