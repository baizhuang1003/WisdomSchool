package com.tianyuan.WisdomTeacherServer.bean;

import java.io.Serializable;

public class ReplenishApplyfor implements Serializable {

   private  String id;
   private  String teacherId;
   private  String replenishTiem;
   private  String disposeState;
   private  String disposeTime;
   private  String updateTime;
   private  String updateUid;
   private  String createUid;
   private  String createTime;
   private  String del;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getReplenishTiem() {
        return replenishTiem;
    }

    public void setReplenishTiem(String replenishTiem) {
        this.replenishTiem = replenishTiem;
    }

    public String getDisposeState() {
        return disposeState;
    }

    public void setDisposeState(String disposeState) {
        this.disposeState = disposeState;
    }

    public String getDisposeTime() {
        return disposeTime;
    }

    public void setDisposeTime(String disposeTime) {
        this.disposeTime = disposeTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUid() {
        return updateUid;
    }

    public void setUpdateUid(String updateUid) {
        this.updateUid = updateUid;
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
