package com.zzz.entity;

import java.util.Date;
import javax.annotation.Generated;

public class SysLog {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long userId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String username;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String operation;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer time;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String method;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String params;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String ip;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date gmtCreate;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(Long id) {
        this.id = id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getUserId() {
        return userId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getUsername() {
        return username;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getOperation() {
        return operation;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOperation(String operation) {
        this.operation = operation == null ? null : operation.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getTime() {
        return time;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTime(Integer time) {
        this.time = time;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getMethod() {
        return method;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getParams() {
        return params;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setParams(String params) {
        this.params = params == null ? null : params.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getIp() {
        return ip;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getGmtCreate() {
        return gmtCreate;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}