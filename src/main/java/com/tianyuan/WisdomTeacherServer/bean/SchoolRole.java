package com.tianyuan.WisdomTeacherServer.bean;

import java.io.Serializable;
import java.util.Date;

public class SchoolRole implements Serializable {
    private String id;

    private String name;

    private String sort;

    private String remark;

    private String updateTime;

    private String createUid;

    private String createTime;

    private String updateUid;

    private String del;

    private static final long serialVersionUID = 1L;



    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateUid() {
        return createUid;
    }

    public void setCreateUid(String createUid) {
        this.createUid = createUid;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateUid() {
        return updateUid;
    }

    public void setUpdateUid(String updateUid) {
        this.updateUid = updateUid;
    }

    public String getDel() {
        return del;
    }

    public void setDel(String del) {
        this.del = del;
    }
}