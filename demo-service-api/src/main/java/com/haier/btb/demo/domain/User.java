package com.haier.btb.demo.domain;

/**
 * Title: 用户对象
 * Author: interconn
 * Mailto:interx@haier.com
 * On: 2017-12-18  9:51
 */

public class User {

    private String username;

    private String password;

    private long id;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
