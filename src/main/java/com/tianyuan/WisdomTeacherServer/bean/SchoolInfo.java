package com.tianyuan.WisdomTeacherServer.bean;

import java.io.Serializable;
import java.util.Date;

public class SchoolInfo implements Serializable {
    private String  id;

    private String  name;

    private String abbr;

    private String code;

    private String type;

    private String regionid;

    private String region;

    private String address;

    private String weblogo;

    private String applogo;

    private String vaildpic;

    private String summary;

    private String phone;

    private String fax;

    private String zip;

    private String builddate;

    private String  web;

    private String  contact;

    private String  mobile;

    private String  really;

    private String  createuid;

    private String  createtime;

    private String  updateuid;

    private String   updatetime;

    private Boolean  del;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBuilddate() {
        return builddate;
    }

    public void setBuilddate(String builddate) {
        this.builddate = builddate;
    }

    public String getReally() {
        return really;
    }

    public void setReally(String really) {
        this.really = really;
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

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAbbr() {
        return abbr;
    }

    public void setAbbr(String abbr) {
        this.abbr = abbr == null ? null : abbr.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
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

    public String getWeblogo() {
        return weblogo;
    }

    public void setWeblogo(String weblogo) {
        this.weblogo = weblogo == null ? null : weblogo.trim();
    }

    public String getApplogo() {
        return applogo;
    }

    public void setApplogo(String applogo) {
        this.applogo = applogo == null ? null : applogo.trim();
    }

    public String getVaildpic() {
        return vaildpic;
    }

    public void setVaildpic(String vaildpic) {
        this.vaildpic = vaildpic == null ? null : vaildpic.trim();
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip == null ? null : zip.trim();
    }


    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web == null ? null : web.trim();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }


    public Boolean getDel() {
        return del;
    }

    public void setDel(Boolean del) {
        this.del = del;
    }
}