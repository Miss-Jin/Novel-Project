package com.zzz.config;

import com.zzz.entity.*;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

//将常用类放入容器，方便其他模块调用
@Configurable
public class BeanConfig {


    //下面的类是book相关类
    @Bean
    public Book Book(){return new Book();}

    @Bean
    public BookAuthor BookAuthor(){return new BookAuthor();}

    @Bean
    public BookCategory BookCategory(){return new BookCategory();}

    @Bean
    public BookComment BookComment(){return new BookComment();}

    @Bean
    public BookCommentReply BookCommentReply(){return new BookCommentReply();}

    @Bean
    public BookContent BookContent(){return new BookContent();}

    @Bean
    public BookIndex BookIndex(){return new BookIndex();}

    @Bean
    public BookScreenBullet BookScreenBullet(){return new BookScreenBullet();}

    @Bean
    public BookSetting BookSetting(){return new BookSetting();}


}
