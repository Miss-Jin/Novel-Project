package com.zzz.entity;

import javax.annotation.Generated;

public class SysRoleDataPerm {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long roleId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long permId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(Long id) {
        this.id = id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getRoleId() {
        return roleId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getPermId() {
        return permId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPermId(Long permId) {
        this.permId = permId;
    }
}