package authSysService;

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


    public MainThread () {

        InputStream adminResourceAsStream = MainThread.class.getResourceAsStream(adminPath);
        InputStream userResourceAsStream = MainThread.class.getResourceAsStream(userPath);

        try {
            adminProperty.load(adminResourceAsStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            userProperty.load(userResourceAsStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static UserRole authCheck(String username, String password) {

        MainThread mainThread = new MainThread();

        System.out.println("username= "+ username);
        System.out.println("username chk= " +mainThread.adminProperty.getProperty(username));
        System.out.println("password= "+password);
        System.out.println("password chk= "+mainThread.adminProperty.getProperty(password));

        if ((username.equals(mainThread.adminProperty.getProperty(username))) &&
                (password.equals(mainThread.adminProperty.getProperty(password)))) {
            userRole = ADMIN;
        } else if ((username.equals(mainThread.userProperty.getProperty(username))) &&
                (password.equals(mainThread.userProperty.getProperty(password)))) {
            userRole = USER;
        }
        return userRole;

    }


}

