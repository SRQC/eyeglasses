package com.zb.entity;

public class Brand {
    private Integer brandid;

    private String brandname;

    private String brandsynopsis;

    private String logo;

    public Integer getBrandid() {
        return brandid;
    }

    public void setBrandid(Integer brandid) {
        this.brandid = brandid;
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname == null ? null : brandname.trim();
    }

    public String getBrandsynopsis() {
        return brandsynopsis;
    }

    public void setBrandsynopsis(String brandsynopsis) {
        this.brandsynopsis = brandsynopsis == null ? null : brandsynopsis.trim();
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }
}