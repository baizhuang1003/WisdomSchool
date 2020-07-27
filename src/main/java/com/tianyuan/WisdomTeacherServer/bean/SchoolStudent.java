package com.tianyuan.WisdomTeacherServer.bean;

import java.io.Serializable;
import java.util.Date;

public class SchoolStudent implements Serializable {
    private String id;

    private String schoolid;

    private String gradeid;

    private String classid;

    private String wtwatchid;

    private String nick;

    private String name;

    private String code;

    private String gender;

    private String birth;

    private String idnumber;

    private String ethnic;

    private String political;

    private String mobile;

    private String jobtime;

    private String regionid;

    private String region;

    private String address;

    private String avator;

    private String idface;

    private String idback;

    private String idcode;

    private String really;

    private String enable;

    private String updatetime;

    private String createuid;

    private String createtime;

    private String updateuid;

    private String del;

    private static final long serialVersionUID = 1L;


    public String getWtwatchid() {
        return wtwatchid;
    }

    public void setWtwatchid(String wtwatchid) {
        this.wtwatchid = wtwatchid == null ? null : wtwatchid.trim();
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick == null ? null : nick.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth == null ? null : birth.trim();
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber == null ? null : idnumber.trim();
    }

    public String getEthnic() {
        return ethnic;
    }

    public void setEthnic(String ethnic) {
        this.ethnic = ethnic == null ? null : ethnic.trim();
    }

    public String getPolitical() {
        return political;
    }

    public void setPolitical(String political) {
        this.political = political == null ? null : political.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }


    public String getRegionid() {
        return regionid;
    }

    public void setRegionid(String regionid) {
        this.regionid = regionid == null ? null : regionid.trim();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getAvator() {
        return avator;
    }

    public void setAvator(String avator) {
        this.avator = avator == null ? null : avator.trim();
    }

    public String getIdface() {
        return idface;
    }

    public void setIdface(String idface) {
        this.idface = idface == null ? null : idface.trim();
    }

    public String getIdback() {
        return idback;
    }

    public void setIdback(String idback) {
        this.idback = idback == null ? null : idback.trim();
    }

    public String getIdcode() {
        return idcode;
    }

    public void setIdcode(String idcode) {
        this.idcode = idcode == null ? null : idcode.trim();
    }

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

    public String getGradeid() {
        return gradeid;
    }

    public void setGradeid(String gradeid) {
        this.gradeid = gradeid;
    }

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid;
    }

    public String getJobtime() {
        return jobtime;
    }

    public void setJobtime(String jobtime) {
        this.jobtime = jobtime;
    }

    public String getReally() {
        return really;
    }

    public void setReally(String really) {
        this.really = really;
    }

    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable;
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