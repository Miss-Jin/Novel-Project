package com.zzz.entity;

import java.util.Date;
import javax.annotation.Generated;

public class BookScreenBullet {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long contentId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String screenBullet;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date createTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(Long id) {
        this.id = id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getContentId() {
        return contentId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setContentId(Long contentId) {
        this.contentId = contentId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getScreenBullet() {
        return screenBullet;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setScreenBullet(String screenBullet) {
        this.screenBullet = screenBullet == null ? null : screenBullet.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getCreateTime() {
        return createTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}