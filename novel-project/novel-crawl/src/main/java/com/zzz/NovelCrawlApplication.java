package com.zzz;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

//@SpringBootApplication(exclude={DruidDataSourceAutoConfigure.class})
//scanBasePackages = {"com.zzz"}
@SpringBootApplication
public class NovelCrawlApplication {

        public static void main(String[] args) {
            SpringApplication.run(NovelCrawlApplication.class, args);
        }
    }
