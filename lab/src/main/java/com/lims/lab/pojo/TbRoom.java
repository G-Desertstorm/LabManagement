package com.lims.lab.pojo;

public class TbRoom {
    private Integer id;

    private Integer rid;

    private String rname;

    private String raddress;

    private String mids;

    private Integer mcount;

    private Integer status;

    private String description;

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

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname == null ? null : rname.trim();
    }

    public String getRaddress() {
        return raddress;
    }

    public void setRaddress(String raddress) {
        this.raddress = raddress == null ? null : raddress.trim();
    }

    public String getMids() {
        return mids;
    }

    public void setMids(String mids) {
        this.mids = mids == null ? null : mids.trim();
    }

    public Integer getMcount() {
        return mcount;
    }

    public void setMcount(Integer mcount) {
        this.mcount = mcount;
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

    @Override
    public String toString() {
        return "TbRoom{" +
                "id=" + id +
                ", rid=" + rid +
                ", rname='" + rname + '\'' +
                ", raddress='" + raddress + '\'' +
                ", mids='" + mids + '\'' +
                ", mcount=" + mcount +
                ", status=" + status +
                ", description='" + description + '\'' +
                '}';
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();



    }
}