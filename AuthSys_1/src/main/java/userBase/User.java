package userBase;

import authSysService.UserRole;

/**
 * Created by WEO on 8/4/16.
 */
public class User {

    private String username;
    private String password;
    private UserRole userRole;


    public User(String userName, String passWord, UserRole userRole) {
        this.username = userName;
        this.password = passWord;
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
