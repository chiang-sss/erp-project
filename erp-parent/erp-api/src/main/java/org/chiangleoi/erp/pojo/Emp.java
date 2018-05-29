package org.chiangleoi.erp.pojo;

import java.io.Serializable;

/**
 * 用户表
 */
public class Emp implements Serializable {
    private String uuid;
    private String username;
    private String pwd;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
