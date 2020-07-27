package com.tianyuan.WisdomTeacherServer.bean;

import java.io.Serializable;
import java.util.Date;

public class SchoolDynameicNum implements Serializable {
    private String id;

    private String dynameicId;

    private String commentNum;

    private String hitsNum;

    private String remark;

    private String updateTime;

    private String createUid;

    private String createTime;

    private String updateUid;

    private String del;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDynameicId() {
        return dynameicId;
    }

    public void setDynameicId(String dynameicId) {
        this.dynameicId = dynameicId;
    }

    public String getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(String commentNum) {
        this.commentNum = commentNum;
    }

    public String getHitsNum() {
        return hitsNum;
    }

    public void setHitsNum(String hitsNum) {
        this.hitsNum = hitsNum;
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
}