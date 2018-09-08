package com.zb.entity;

import java.util.Date;

public class BannerImge {
    private Integer bIId;

    private String bIName;

    private String bIUrl;

    private String content;

    private String describe;

    private String url;

    private Integer clicks;

    private Integer createId;

    private Date createTime;

    private Integer updateId;

    private Date updateTime;

    private Integer ordid;

    private Integer status;

    public Integer getbIId() {
        return bIId;
    }

    public void setbIId(Integer bIId) {
        this.bIId = bIId;
    }

    public String getbIName() {
        return bIName;
    }

    public void setbIName(String bIName) {
        this.bIName = bIName == null ? null : bIName.trim();
    }

    public String getbIUrl() {
        return bIUrl;
    }

    public void setbIUrl(String bIUrl) {
        this.bIUrl = bIUrl == null ? null : bIUrl.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getClicks() {
        return clicks;
    }

    public void setClicks(Integer clicks) {
        this.clicks = clicks;
    }

    public Integer getCreateId() {
        return createId;
    }

    public void setCreateId(Integer createId) {
        this.createId = createId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateId() {
        return updateId;
    }

    public void setUpdateId(Integer updateId) {
        this.updateId = updateId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getOrdid() {
        return ordid;
    }

    public void setOrdid(Integer ordid) {
        this.ordid = ordid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}