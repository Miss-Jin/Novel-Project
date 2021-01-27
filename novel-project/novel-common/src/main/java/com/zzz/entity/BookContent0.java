package com.zzz.entity;

import javax.annotation.Generated;

public class BookContent0 {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long id;  //主键（非空）

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long indexId;  //目录ID

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String content;  //正文

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