package com.tianyuan.WisdomTeacherServer.bean;

import java.io.Serializable;
import java.util.Date;

public class StudentGuardion extends StudentGuardionKey implements Serializable {
    private String relation;

    private String  important;

    private String  updatetime;

    private String  createuid;

    private String  createtime;

    private String  updateuid;

    private String  del;

    private static final long serialVersionUID = 1L;

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation == null ? null : relation.trim();
    }

    public String getImportant() {
        return important;
    }

    public void setImportant(String important) {
        this.important = important;
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }

    public String getCreateuid() {
        return createuid;
    }

    public void setCreateuid(String createuid) {
        this.createuid = createuid;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getUpdateuid() {
        return updateuid;
    }

    public void setUpdateuid(String updateuid) {
        this.updateuid = updateuid;
    }

    public String getDel() {
        return del;
    }

    public void setDel(String del) {
        this.del = del;
    }
}