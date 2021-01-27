package com.zzz.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import javax.sql.DataSource;

//往容器添加常用的类方便调用
@Configurable
@ComponentScan(basePackages = {"com.zzz"})
public class CrawlerConfig {



}
