package userDB;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by WEO on 8/22/16.
 */
public class UserService {

    public static UserObject[] userDB = new UserObject[0];

    public static UserObject[] getUserDB() {
        return userDB;
    }

    public static void dbCreate(Scanner scanner) {

        System.out.println("Enter amount of users");
        int useramount = scanner.nextInt();

        for (int i = 0; i < useramount; i++) {

            System.out.println("Enter name of user");
            String name = scanner.next();
            System.out.println("Enter boss of user");
            String boss = scanner.next();
            UserObject newUser = new UserObject();
            newUser.setName(name);
            newUser.setBoss(boss);

            userDB = Arrays.copyOf(userDB, userDB.length + 1);
            userDB[userDB.length - 1] = newUser;

        }

        System.out.println(Arrays.toString(getUserDB()));
    }

    static void bossSearch(Scanner scanner) {
        UserObject[] bossArray = new UserObject[0];

        System.out.println("Enter name for search");
        String username = scanner.next();

        for (int i = 0; i < userDB.length; i++) {

            if (userDB[i].getName().equals(username)) {
                bossArray = Arrays.copyOf(bossArray, bossArray.length + 1);
                bossArray[bossArray.length - 1] = userDB[i];
                username = userDB[i].getBoss();
            }
        }

        System.out.println(Arrays.toString(bossArray));


    }

    public static String recBossSearch(String username, int i) {
        System.out.println(i + " i");
        System.out.println(userDB.length);
        if (i >= userDB.length) return null;
        if (username.equals(userDB[i].getName())) return recBossSearch(userDB[i].getBoss(), ++i);
        return recBossSearch(username, ++i);

    }


}

