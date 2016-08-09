package authSysTest;

import authSysService.AdminMode;
import authSysService.UserMode;
import authSysService.UserRole;
import userBase.UserServiceDB;

import java.util.Scanner;

/**
 * Created by WEO on 8/4/16.
 */
public class Testing {

    public static void main(String[] args) {

        UserServiceDB userServiceDB = new UserServiceDB();
        UserRole userRole;

        userServiceDB.fillDB();


        System.out.println("DataBase ready. Do  you want to proceed to functionality? Y/N");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();

        switch (choice) {

            case "Y":
            case "y":

                System.out.println("Enter username");
                String username = scanner.next();
                System.out.println("Enter password");
                String password = scanner.next();

                userRole = userServiceDB.userSearch(username, password);

                if (userRole.equals(UserRole.ADMIN)) {
                    AdminMode.adminCommonMethod();
                } else if (userRole.equals(UserRole.USER)) {
                    UserMode.userCommonMethod();
                }
        }
    }


}

