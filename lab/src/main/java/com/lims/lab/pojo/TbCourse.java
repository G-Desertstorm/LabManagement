package com.lims.lab.pojo;

public class TbCourse {
    private Integer kid;

    private String kname;

    private Integer cid;

    private String description;

    public Integer getKid() {
        return kid;
    }

    public void setKid(Integer kid) {
        this.kid = kid;
    }

    public String getKname() {
        return kname;
    }

    public void setKname(String kname) {
        this.kname = kname == null ? null : kname.trim();
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    @Override
    public String toString() {
        return "TbCourse{" +
                "kid=" + kid +
                ", kname='" + kname + '\'' +
                ", cid=" + cid +
                ", description='" + description + '\'' +
                '}';
    }
}