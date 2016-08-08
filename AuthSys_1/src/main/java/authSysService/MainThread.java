package authSysService;

import userBase.User;
import userBase.UserDB;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static authSysService.UserRole.ADMIN;
import static authSysService.UserRole.ANONYM;
import static authSysService.UserRole.USER;

/**
 * Created by WEO on 8/4/16.
 */
public class MainThread {

    private String adminPath = "/admin.properties";
    private String userPath = "/user.properties";
    private static UserRole userRole = ANONYM;

    public Properties adminProperty = new Properties();
    public Properties userProperty = new Properties();


    public MainThread() {

        InputStream adminResourceAsStream = MainThread.class.getResourceAsStream(adminPath);
        InputStream userResourceAsStream = MainThread.class.getResourceAsStream(userPath);

        try {
            adminProperty.load(adminResourceAsStream);
            userProperty.load(userResourceAsStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public UserRole authCheck(String username, String password) {

        String adminName = adminProperty.getProperty("username");
        String adminPassword = adminProperty.getProperty("password");
        String userName = userProperty.getProperty("username");
        String userPassword = userProperty.getProperty("password");

        if ((username.equals(adminName)) &&
                (password.equals(adminPassword))) {
            userRole = ADMIN;
        } else if ((username.equals(userName)) &&
                (password.equals(userPassword))) {
            userRole = USER;
        } else userRole = ANONYM;

        return userRole;
    }
}



