package com;

/**
 * Created by WEO on 7/28/16.
 */
public class UserBase {
    private String username;
    private String password;
    private int access;

    public UserBase(String username, String password, int access) {
        this.username = username;
        this.password = password;
        this.access = access;
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

    public void setPassWord(String password) {
        this.password = password;
    }

    public int getAccess() {
        return access;
    }

    public void setAccess(int access) {
        this.access = access;
    }
}
