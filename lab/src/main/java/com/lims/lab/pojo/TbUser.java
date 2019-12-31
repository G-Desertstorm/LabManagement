package com.lims.lab.pojo;

public class TbUser {
    private Integer uid;

    private Integer number;

    private String username;

    private String upassword;

    private String sex;

    private String phone;

    private Integer gradeid;

    private Integer majorid;

    private String cid;

    private Integer roleId;

    private String status;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword == null ? null : upassword.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getGradeid() {
        return gradeid;
    }

    public void setGradeid(Integer gradeid) {
        this.gradeid = gradeid;
    }

    public Integer getMajorid() {
        return majorid;
    }

    public void setMajorid(Integer majorid) {
        this.majorid = majorid;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }


    @Override
    public String toString() {
        return "TbUser{" +
                "uid=" + uid +
                ", number=" + number +
                ", username='" + username + '\'' +
                ", upassword='" + upassword + '\'' +
                ", sex='" + sex + '\'' +
                ", phone='" + phone + '\'' +
                ", gradeid=" + gradeid +
                ", majorid=" + majorid +
                ", cid='" + cid + '\'' +
                ", roleId=" + roleId +
                ", status='" + status + '\'' +
                '}';
    }
}