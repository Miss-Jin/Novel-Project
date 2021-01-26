package com.zzz.entity;

import org.springframework.stereotype.Component;

import javax.annotation.Generated;
@Component
public class BookContent {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long id;  //主键（非空）--注意。必须和书本id一致

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long indexId;  //目录ID（这个字段没用，乱填）

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String content;  //正文（整本书正文放在一起）

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(Long id) {
        this.id = id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getIndexId() {
        return indexId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setIndexId(Long indexId) {
        this.indexId = indexId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getContent() {
        return content;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}