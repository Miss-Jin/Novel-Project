package com.ccc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//需要common的组件，所以扫描它
@ComponentScan(basePackages={"com.zzz","com.ccc"})
public class NovelCrawlApplication {
        public static void main(String[] args) {
            SpringApplication.run(NovelCrawlApplication.class, args);
        }
    }
