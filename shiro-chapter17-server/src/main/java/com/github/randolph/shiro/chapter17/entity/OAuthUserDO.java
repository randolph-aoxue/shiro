package com.github.randolph.shiro.chapter17.entity;

import java.util.Date;

public class OAuthUserDO {
    private String keyid;

    private String username;

    private String password;

    private String salt;

    private Date createtime;

    private Date updatetime;

    private Date isdelete;

    public String getKeyid() {
        return keyid;
    }

    public void setKeyid(String keyid) {
        this.keyid = keyid == null ? null : keyid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
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

    public Date getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Date isdelete) {
        this.isdelete = isdelete;
    }
}