package com.tianyuan.WisdomTeacherServer.bean;

import java.io.Serializable;

public class StudentGuardionKey implements Serializable {
    private String schoolid;

    private String guardionid;

    private String studentid;

    private static final long serialVersionUID = 1L;

    public String getSchoolid() {
        return schoolid;
    }

    public void setSchoolid(String schoolid) {
        this.schoolid = schoolid;
    }

    public String getGuardionid() {
        return guardionid;
    }

    public void setGuardionid(String guardionid) {
        this.guardionid = guardionid;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }
}