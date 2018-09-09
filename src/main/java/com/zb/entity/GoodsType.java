package com.zb.entity;

public class GoodsType {
    private Integer id;

    private String name;

    private Integer pid;

    private String twomeun;

    private String color;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getTwomeun() {
        return twomeun;
    }

    public void setTwomeun(String twomeun) {
        this.twomeun = twomeun == null ? null : twomeun.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }
}