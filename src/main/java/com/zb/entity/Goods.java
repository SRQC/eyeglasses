package com.zb.entity;

public class Goods {
    private Integer goodsid;

    private String goodsname;

    private String goodssynopsis;

    private String goodsdetails;

    private Integer goodsclicks;

    private Double originalPrice;

    private Double discountprice;

    private Integer salesVolume;

    private String ishot;

    private String isnew;

    private Integer goodstypeid;

    private String color;

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public String getGoodssynopsis() {
        return goodssynopsis;
    }

    public void setGoodssynopsis(String goodssynopsis) {
        this.goodssynopsis = goodssynopsis == null ? null : goodssynopsis.trim();
    }

    public String getGoodsdetails() {
        return goodsdetails;
    }

    public void setGoodsdetails(String goodsdetails) {
        this.goodsdetails = goodsdetails == null ? null : goodsdetails.trim();
    }

    public Integer getGoodsclicks() {
        return goodsclicks;
    }

    public void setGoodsclicks(Integer goodsclicks) {
        this.goodsclicks = goodsclicks;
    }

    public Double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public Double getDiscountprice() {
        return discountprice;
    }

    public void setDiscountprice(Double discountprice) {
        this.discountprice = discountprice;
    }

    public Integer getSalesVolume() {
        return salesVolume;
    }

    public void setSalesVolume(Integer salesVolume) {
        this.salesVolume = salesVolume;
    }

    public String getIshot() {
        return ishot;
    }

    public void setIshot(String ishot) {
        this.ishot = ishot == null ? null : ishot.trim();
    }

    public String getIsnew() {
        return isnew;
    }

    public void setIsnew(String isnew) {
        this.isnew = isnew == null ? null : isnew.trim();
    }

    public Integer getGoodstypeid() {
        return goodstypeid;
    }

    public void setGoodstypeid(Integer goodstypeid) {
        this.goodstypeid = goodstypeid;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }
}