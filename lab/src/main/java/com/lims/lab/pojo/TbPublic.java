package com.lims.lab.pojo;

import java.util.Date;

public class TbPublic {
    private Integer id;

    private Integer xid;

    private String xname;

    private String xcontent;

    private Date time;

    private Date finishtime;

    private Date endtime;

    private Integer tid;

    private Integer uid;

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

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Date getFinishtime() {
        return finishtime;
    }

    public void setFinishtime(Date finishtime) {
        this.finishtime = finishtime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }


    @Override
    public String toString() {
        return "TbPublic{" +
                "id=" + id +
                ", xid=" + xid +
                ", xname='" + xname + '\'' +
                ", xcontent='" + xcontent + '\'' +
                ", time=" + time +
                ", finishtime=" + finishtime +
                ", endtime=" + endtime +
                ", tid=" + tid +
                ", uid=" + uid +
                '}';
    }
}