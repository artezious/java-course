package userBase;

import authSysService.MainThread;
import authSysService.UserRole;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by WEO on 8/8/16.
 */
public class UserServiceDB extends User {

    private User[] userDB = new User[0];
    private UserRole userRole = UserRole.ANONYM;

    public User[] getUserDB() {
        return userDB;
    }

    public void setUserDB(User[] userDB) {
        this.userDB = userDB;
    }

    public void fillDB() {

        Scanner scanner = new Scanner(System.in);
        MainThread mainThread = new MainThread();

        System.out.println("Enter amount of users");
        int userCount = scanner.nextInt();

        for (int i = 0; i < userCount; i++) {

            System.out.println("Enter username");
            String username = scanner.next();
            System.out.println("Enter password");
            String password = scanner.next();

            if (username == null || password == null) {

                throw new IllegalArgumentException("Credentials details shouldnt be null");

            } else {
                User newUser = new User(username, password, mainThread.authCheck(username, password));
                userDB = Arrays.copyOf(userDB, userDB.length + 1);
                userDB[userDB.length - 1] = newUser;
            }
        }
        System.out.println(Arrays.toString(userDB));
    }

    public UserRole userSearch(String username, String password) {

        for (int i = 0; i < userDB.length; i++)

        {
            if (username.equals(userDB[i].getUsername()) &&
                    password.equals(userDB[i].getPassword())) {
                userRole = userDB[i].getUserRole();
                break;
            }
        }

        return userRole;
    }

    @Override
    public String toString() {
        return "UserServiceDB{" +
                "userDB=" + Arrays.toString(userDB) +
                '}';
    }
}
