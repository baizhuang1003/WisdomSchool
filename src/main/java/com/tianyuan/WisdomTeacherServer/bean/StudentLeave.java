package com.tianyuan.WisdomTeacherServer.bean;

import java.io.Serializable;
import java.util.Date;

public class StudentLeave implements Serializable {
    private String id;

    private String guardionId;

    private String guardionName;

    private String guardionMobile;

    private String studentId;

    private String studentName;

    private String teacherId;

    private String teacherName;

    private String typeId;

    private String typeName;

    private String startTime;

    private String endTime;

    private String status;

    private String remark;

    private String updateTime;

    private String createUid;

    private String createTime;

    private String updateUid;

    private String del;

    private static final long serialVersionUID = 1L;

    public StudentLeave() {
    }

    public StudentLeave(String id, String guardionId, String guardionName, String guardionMobile, String studentId,
                        String studentName, String teacherId, String teacherName, String typeId, String typeName, String
                        startTime, String endTime, String status, String remark, String updateTime, String createUid,
                        String createTime, String updateUid, String del) {
        this.id = id;
        this.guardionId = guardionId;
        this.guardionName = guardionName;
        this.guardionMobile = guardionMobile;
        this.studentId = studentId;
        this.studentName = studentName;
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.typeId = typeId;
        this.typeName = typeName;
        this.startTime = startTime;
        this.endTime = endTime;
        this.status = status;
        this.remark = remark;
        this.updateTime = updateTime;
        this.createUid = createUid;
        this.createTime = createTime;
        this.updateUid = updateUid;
        this.del = del;
    }



    public String getGuardionName() {
        return guardionName;
    }

    public void setGuardionName(String guardionName) {
        this.guardionName = guardionName == null ? null : guardionName.trim();
    }

    public String getGuardionMobile() {
        return guardionMobile;
    }

    public void setGuardionMobile(String guardionMobile) {
        this.guardionMobile = guardionMobile == null ? null : guardionMobile.trim();
    }


    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }



    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }



    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
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

    public String getGuardionId() {
        return guardionId;
    }

    public void setGuardionId(String guardionId) {
        this.guardionId = guardionId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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