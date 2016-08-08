package authSysTest;

import authSysService.MainThread;
import userBase.User;

import java.util.Scanner;

/**
 * Created by WEO on 8/4/16.
 */
public class Testing {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username");
        String username = scanner.next();
        System.out.println("Enter password");
        String password = scanner.next();

        MainThread mainThread = new MainThread();

        User newuser = new User( username, password, mainThread.authCheck(username,password));

        System.out.println(newuser);
    }
}
