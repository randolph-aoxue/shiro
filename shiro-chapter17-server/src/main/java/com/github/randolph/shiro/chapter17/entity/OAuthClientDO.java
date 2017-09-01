package com.github.randolph.shiro.chapter17.entity;

import java.util.Date;

public class OAuthClientDO {
    private String keyid;

    private String clientname;

    private String clientkeyid;

    private String clientsecret;

    private Date createtime;

    private Date updatetime;

    private Boolean isdelete;

    public String getKeyid() {
        return keyid;
    }

    public void setKeyid(String keyid) {
        this.keyid = keyid == null ? null : keyid.trim();
    }

    public String getClientname() {
        return clientname;
    }

    public void setClientname(String clientname) {
        this.clientname = clientname == null ? null : clientname.trim();
    }

    public String getClientkeyid() {
        return clientkeyid;
    }

    public void setClientkeyid(String clientkeyid) {
        this.clientkeyid = clientkeyid == null ? null : clientkeyid.trim();
    }

    public String getClientsecret() {
        return clientsecret;
    }

    public void setClientsecret(String clientsecret) {
        this.clientsecret = clientsecret == null ? null : clientsecret.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Boolean getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Boolean isdelete) {
        this.isdelete = isdelete;
    }
}