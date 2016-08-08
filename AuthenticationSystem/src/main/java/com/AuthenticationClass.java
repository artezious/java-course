package com;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by WEO on 7/28/16.
 */
public class AuthenticationClass {

    private String username;
    private String password;
    private int access = 0;
    private UserBase newUser;

    AuthenticationClass(String password, String username) {
        this.password = password;
        this.username = username;
    }

    public UserBase accessTest() throws IOException {
        InputStream resourseAsStreamAdmin = AuthenticationClass.class.getClassLoader().getResourceAsStream("com/admin.properties");
        InputStream getResourseAsStreamUser = AuthenticationClass.class.getClassLoader().getResourceAsStream("com/user.properties");

        Properties propertiesAdmin = new Properties();
        Properties propertiesUser = new Properties();

        propertiesAdmin.load(resourseAsStreamAdmin);
        propertiesUser.load(getResourseAsStreamUser);

        for (String key : propertiesAdmin.stringPropertyNames()) {
            if ((key.equals("username")) && (propertiesAdmin.get(key).equals(username))) {
                for (String key1 : propertiesAdmin.stringPropertyNames()) {
                    if ((key1.equals("password")) && (propertiesAdmin.get(key1).equals(password))) {
                        access = 10;
                        newUser = new AuthAdmin(username, password, access);
                        AuthAdmin.adminCommonMethod();
                        break;
                    }
                }
            }
        }

        for (String key : propertiesUser.stringPropertyNames()) {

            if ((key.equals("username")) && (propertiesUser.get(key).equals(username))) {
                for (String key1 : propertiesUser.stringPropertyNames()) {
                    if ((key1.equals("password")) && (propertiesUser.get(key1).equals(password))) {
                        access = 1;
                        newUser = new AuthUser(username, password, access);
                        AuthUser.userCommonMethod();
                        break;
                    }
                }
            }
        }
        if (access == 0) {
            throw new RuntimeException("Access Denied");
        }
        return newUser;

    }


}
