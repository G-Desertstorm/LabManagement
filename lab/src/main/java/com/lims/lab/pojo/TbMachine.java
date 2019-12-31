package com.lims.lab.pojo;

import java.util.Date;

public class TbMachine {
    private Integer id;

    private Integer tid;

    private String tname;

    private Date time;

    private String rid;

    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname == null ? null : tname.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid == null ? null : rid.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    @Override
    public String toString() {
        return "TbMachine{" +
                "id=" + id +
                ", tid=" + tid +
                ", tname='" + tname + '\'' +
                ", time=" + time +
                ", rid='" + rid + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}