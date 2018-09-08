package com.zb.entity;

public class GoodsType {
    private Integer typeid;

    private String typename;

    private Integer pid;

    private Integer twomeun;

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getTwomeun() {
        return twomeun;
    }

    public void setTwomeun(Integer twomeun) {
        this.twomeun = twomeun;
    }
}