package com.tianyuan.WisdomTeacherServer.bean;

import java.io.Serializable;

public class SchoolDormKey implements Serializable {
    private String id;

    private String schoolid;

    private String floorid;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSchoolid() {
        return schoolid;
    }

    public void setSchoolid(String schoolid) {
        this.schoolid = schoolid;
    }

    public String getFloorid() {
        return floorid;
    }

    public void setFloorid(String floorid) {
        this.floorid = floorid;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}