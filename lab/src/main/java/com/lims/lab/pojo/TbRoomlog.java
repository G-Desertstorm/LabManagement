package com.lims.lab.pojo;

import java.util.Date;

public class TbRoomlog {
    private Long id;

    private Integer uid;

    private Integer rid;

    private String method;

    private String description;

    private Date time;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
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
        return "TbRoomlog{" +
                "id=" + id +
                ", uid=" + uid +
                ", rid=" + rid +
                ", method='" + method + '\'' +
                ", description='" + description + '\'' +
                ", time=" + time +
                '}';
    }
}