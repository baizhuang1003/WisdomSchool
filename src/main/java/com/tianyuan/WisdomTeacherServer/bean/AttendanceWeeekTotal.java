package com.tianyuan.WisdomTeacherServer.bean;

import java.io.Serializable;
import java.util.Date;

public class AttendanceWeeekTotal implements Serializable {
    private String   id;

    private String   type;

    private String   teacherId;

    private String   teacherName;

    private String   deptId;

    private String   code;

    private String   attenYear;

    private String   attenMon;

    private String   weekNum;

    private String   normalNum;

    private String   lateNum;

    private String   awayNum;

    private String   lessNum;

    private String   remark;

    private String   updateTime;

    private String   createUid;

    private String   createTime;

    private String   updateUid;

    private String   del;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAttenYear() {
        return attenYear;
    }

    public void setAttenYear(String attenYear) {
        this.attenYear = attenYear;
    }

    public String getAttenMon() {
        return attenMon;
    }

    public void setAttenMon(String attenMon) {
        this.attenMon = attenMon;
    }

    public String getWeekNum() {
        return weekNum;
    }

    public void setWeekNum(String weekNum) {
        this.weekNum = weekNum;
    }

    public String getNormalNum() {
        return normalNum;
    }

    public void setNormalNum(String normalNum) {
        this.normalNum = normalNum;
    }

    public String getLateNum() {
        return lateNum;
    }

    public void setLateNum(String lateNum) {
        this.lateNum = lateNum;
    }

    public String getAwayNum() {
        return awayNum;
    }

    public void setAwayNum(String awayNum) {
        this.awayNum = awayNum;
    }

    public String getLessNum() {
        return lessNum;
    }

    public void setLessNum(String lessNum) {
        this.lessNum = lessNum;
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