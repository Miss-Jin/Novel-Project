package com.zzz.test;

import com.zzz.Pipeline.MyConsolePipeline;
import com.zzz.controller.CrawlController;
import com.zzz.core.CorePageProcessor;
import com.zzz.entity.Book;
import com.zzz.mapper.BookDynamicSqlSupport;
import com.zzz.mapper.BookMapper;
import com.zzz.util.ProduceBean;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

public class test {
    @Autowired
    BookMapper bookMapper;
    @Autowired
    BookDynamicSqlSupport bookDynamicSqlSupport;

    public static void main(String[] args) {

    }
}
