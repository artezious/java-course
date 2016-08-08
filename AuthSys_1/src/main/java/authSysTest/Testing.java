package authSysTest;

import authSysService.AdminMode;
import authSysService.MainThread;
import authSysService.UserMode;
import authSysService.UserRole;
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
        UserRole userRole = UserRole.ANONYM;

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


        System.out.println("DataBase ready. Do  you want to proceed to functionality? Y/N");
        String choice = scanner.next();

        switch (choice) {

            case "Y":
            case "y":

                System.out.println("Enter username");
                String username = scanner.next();
                System.out.println("Enter password");
                String password = scanner.next();

                for (int i = 0; i < userDB.getUserDB().length; i++) {
                    if (username.equals(userDB.getUserDB()[i].getUsername()) &&
                            password.equals(userDB.getUserDB()[i].getPassword())) {
                        userRole = userDB.getUserDB()[i].getUserRole();
                        break;
                    }
                }
                if (userRole.equals(UserRole.ADMIN)) {
                    AdminMode.adminCommonMethod();
                } else if (userRole.equals(UserRole.USER)) {
                    UserMode.userCommonMethod();
                }

        }
    }


}

