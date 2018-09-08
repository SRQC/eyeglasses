package com.zb.entity;

public class GoodsImg {
    private Integer imgid;

    private String goodsimgname;

    private Integer goodsid;

    public Integer getImgid() {
        return imgid;
    }

    public void setImgid(Integer imgid) {
        this.imgid = imgid;
    }

    public String getGoodsimgname() {
        return goodsimgname;
    }

    public void setGoodsimgname(String goodsimgname) {
        this.goodsimgname = goodsimgname == null ? null : goodsimgname.trim();
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }
}