package com.models;

/**
 * Created by WEO on 7/29/16.
 */
public class UserBase {

    public static final String ADMIN_ROLE = "admin";
    public static final String USER_ROLE = "user";
    public static final String ANONYM_ROLE = "anonym";

    private String username;
    private String password;
    private String role = ANONYM_ROLE;

    public UserBase() {
    }

    public UserBase(String username, String password) {
        this.username = username;
        this.password = password;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void commonUserMethods() {
        if (role.equals(ADMIN_ROLE) || role.equals(USER_ROLE)) {
            System.out.println("food for ppl");
        } else {
            throw new RuntimeException("role is incorrect " + ANONYM_ROLE);
        }
    }

    @Override
    public String toString() {
        return "UserBase{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
