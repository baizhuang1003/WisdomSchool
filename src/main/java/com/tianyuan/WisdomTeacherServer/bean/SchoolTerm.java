package com.tianyuan.WisdomTeacherServer.bean;

import java.io.Serializable;
import java.util.Date;

public class SchoolTerm implements Serializable {
    private String id;

    private String name;

    private String starDate;

    private String endDate;

    private String seesaw;

    private String sort;

    private String remark;

    private String updateTime;

    private String createUid;

    private String createTime;

    private String updateUid;

    private String del;

    private static final long serialVersionUID = 1L;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getStarDate() {
        return starDate;
    }

    public void setStarDate(String starDate) {
        this.starDate = starDate == null ? null : starDate.trim();
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate == null ? null : endDate.trim();
    }



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

    public String getSeesaw() {
        return seesaw;
    }

    public void setSeesaw(String seesaw) {
        this.seesaw = seesaw;
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