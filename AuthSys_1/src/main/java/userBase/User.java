package userBase;

import authSysService.UserRole;

/**
 * Created by WEO on 8/4/16.
 */
public class User {

    private String username;
    private String password;
    private UserRole userRole;

    public User() {

    }

    public User(String userName, String passWord, UserRole userRole) {
        this.username = userName;
        this.password = passWord;
        this.userRole = userRole;

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

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", userRole=" + userRole +
                '}';
    }
}
