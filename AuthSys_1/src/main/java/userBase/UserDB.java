package userBase;

import authSysService.MainThread;
import authSysService.UserRole;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by WEO on 8/8/16.
 */
public class UserDB {

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

            User newUser = new User(username, password, mainThread.authCheck(username, password));
            userDB = Arrays.copyOf(userDB, userDB.length + 1);
            userDB[userDB.length - 1] = newUser;
        }

        System.out.println(userDB);

    }

    public UserRole userSearch(String username, String password) {

        getUserDB();
        for (int i = 0; i < getUserDB().length; i++)

        {
            if (username.equals(getUserDB()[i].getUsername()) &&
                    password.equals(getUserDB()[i].getPassword())) {
                userRole = getUserDB()[i].getUserRole();
                break;
            }
        }

        return userRole;
    }

    @Override
    public String toString() {
        return "UserDB{" +
                "userDB=" + Arrays.toString(userDB) +
                '}';
    }
}
