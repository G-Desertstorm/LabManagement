package com.lims.lab.pojo;

import java.util.Date;

public class TbOrderroom {
    private Integer id;

    private Integer rid;

    private Date begintime;

    private Date endtime;

    private Integer status;

    private String description;

    private String reason;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Date getBegintime() {
        return begintime;
    }

    public void setBegintime(Date begintime) {
        this.begintime = begintime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }


    @Override
    public String toString() {
        return "TbOrderroom{" +
                "id=" + id +
                ", rid=" + rid +
                ", begintime=" + begintime +
                ", endtime=" + endtime +
                ", status=" + status +
                ", description='" + description + '\'' +
                ", reason='" + reason + '\'' +
                '}';
    }
}