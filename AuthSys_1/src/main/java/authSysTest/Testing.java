package authSysTest;

import authSysService.MainThread;
import userBase.User;
import userBase.UserDB;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by WEO on 8/4/16.
 */
public class Testing {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MainThread mainThread = new MainThread();
        UserDB userDB = new UserDB();

        System.out.println("Enter amount of users");
        int userCount = scanner.nextInt();

        for (int i = 0; i < userCount; i++) {

            System.out.println("Enter username");
            String username = scanner.next();
            System.out.println("Enter password");
            String password = scanner.next();

            User newuser = new User(username, password, mainThread.authCheck(username, password));
            userDB.addNewUser(newuser);
        }

        System.out.println(userDB);
    }
}
