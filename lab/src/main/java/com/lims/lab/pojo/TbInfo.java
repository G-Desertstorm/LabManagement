package com.lims.lab.pojo;

public class TbInfo {
    private Integer id;

    private Integer xid;

    private String xname;

    private String xcontent;

    private Integer teacherid;

    private String status;

    private String isdelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getXid() {
        return xid;
    }

    public void setXid(Integer xid) {
        this.xid = xid;
    }

    public String getXname() {
        return xname;
    }

    public void setXname(String xname) {
        this.xname = xname == null ? null : xname.trim();
    }

    public String getXcontent() {
        return xcontent;
    }

    public void setXcontent(String xcontent) {
        this.xcontent = xcontent == null ? null : xcontent.trim();
    }

    public Integer getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(Integer teacherid) {
        this.teacherid = teacherid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(String isdelete) {
        this.isdelete = isdelete == null ? null : isdelete.trim();
    }

    @Override
    public String toString() {
        return "TbInfo{" +
                "id=" + id +
                ", xid=" + xid +
                ", xname='" + xname + '\'' +
                ", xcontent='" + xcontent + '\'' +
                ", teacherid=" + teacherid +
                ", status='" + status + '\'' +
                ", isdelete='" + isdelete + '\'' +
                '}';
    }
}