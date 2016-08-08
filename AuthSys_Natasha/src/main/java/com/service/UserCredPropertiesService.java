package com.service;

import com.test.UserTest;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by WEO on 7/29/16.
 */
public class UserCredPropertiesService {

    public static final String USERNAME_PROPERTY_KEY = "username";
    public static final String PASSWORD_PROPERTY_KEY = "password";

    private String userName;
    private String passWord;
    private String path;
    private String role;

    public UserCredPropertiesService(String path, String role) {
        this.path = path;
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public UserCredPropertiesService(String userName, String passWord, String path) {
        this.userName = userName;
        this.passWord = passWord;
        this.path = path;
    }

    public String getUserName() {
        return userName == null ? "" : userName;
    }

    public String getPassWord() {
        return passWord == null ? "" : passWord;
    }

    public void init() throws IOException {
        InputStream resourceAsStream = UserTest.class.getResourceAsStream(path);

        Properties adminProperty = new Properties();
        adminProperty.load(resourceAsStream);

        this.userName = adminProperty.getProperty(USERNAME_PROPERTY_KEY);
        this.passWord = adminProperty.getProperty(PASSWORD_PROPERTY_KEY);

    }

}
