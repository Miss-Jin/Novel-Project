package com.zzz.entity;

import java.util.Date;
import javax.annotation.Generated;

public class SysDataPerm {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String name;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String tableName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String moduleName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String crlAttrName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String crlColumnName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String permCode;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer orderNum;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date gmtCreate;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date gmtModified;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(Long id) {
        this.id = id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getName() {
        return name;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getTableName() {
        return tableName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getModuleName() {
        return moduleName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName == null ? null : moduleName.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCrlAttrName() {
        return crlAttrName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCrlAttrName(String crlAttrName) {
        this.crlAttrName = crlAttrName == null ? null : crlAttrName.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCrlColumnName() {
        return crlColumnName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCrlColumnName(String crlColumnName) {
        this.crlColumnName = crlColumnName == null ? null : crlColumnName.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPermCode() {
        return permCode;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPermCode(String permCode) {
        this.permCode = permCode == null ? null : permCode.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getOrderNum() {
        return orderNum;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getGmtCreate() {
        return gmtCreate;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getGmtModified() {
        return gmtModified;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}