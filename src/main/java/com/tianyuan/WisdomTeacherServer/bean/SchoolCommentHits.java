package com.tianyuan.WisdomTeacherServer.bean;

import java.io.Serializable;
import java.util.Date;

public class SchoolCommentHits implements Serializable {
    private String    id;

    private String    dynamicId;

    private String    userId;

    private String    state;

    private String    remark;

    private String    updateTime;

    private String    createUid;

    private String    createTime;

    private String    updateUid;

    private String    del;

    private static final long serialVersionUID = 1L;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDynamicId() {
        return dynamicId;
    }

    public void setDynamicId(String dynamicId) {
        this.dynamicId = dynamicId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}