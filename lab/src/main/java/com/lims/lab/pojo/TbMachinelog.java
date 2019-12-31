package com.lims.lab.pojo;

import java.util.Date;

public class TbMachinelog {
    private Integer id;

    private Integer uid;

    private Integer tid;

    private String method;

    private String description;

    private Date time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }


    @Override
    public String toString() {
        return "TbMachinelog{" +
                "id=" + id +
                ", uid=" + uid +
                ", tid=" + tid +
                ", method='" + method + '\'' +
                ", description='" + description + '\'' +
                ", time=" + time +
                '}';
    }
}