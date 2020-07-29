package com.tianyuan.WisdomTeacherServer.bean;

import java.io.Serializable;

public class TeacherLeaveRecord implements Serializable {

   private String id;
   private String leaveType;
   private String leaveDuration;
   private String leaveTheReason;
   private String leaveId ;
   private String startTime;
   private String endTime;
   private String applyforTime ;
   private String approvalStatus;
   private String updateUid;
   private String updateTime;
   private String createUid;
   private String createTime;
   private String del;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLeaveType() {
        return leaveType;
    }

    public void setLeaveType(String leaveType) {
        this.leaveType = leaveType;
    }

    public String getLeaveDuration() {
        return leaveDuration;
    }

    public void setLeaveDuration(String leaveDuration) {
        this.leaveDuration = leaveDuration;
    }

    public String getLeaveTheReason() {
        return leaveTheReason;
    }

    public void setLeaveTheReason(String leaveTheReason) {
        this.leaveTheReason = leaveTheReason;
    }

    public String getLeaveId() {
        return leaveId;
    }

    public void setLeaveId(String leaveId) {
        this.leaveId = leaveId;
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

    public String getApplyforTtime() {
        return applyforTime;
    }

    public void setApplyforTtime(String applyforTtime) {
        this.applyforTime = applyforTtime;
    }

    public String getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public String getUpdateUid() {
        return updateUid;
    }

    public void setUpdateUid(String updateUid) {
        this.updateUid = updateUid;
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

    public String getDel() {
        return del;
    }

    public void setDel(String del) {
        this.del = del;
    }
}
