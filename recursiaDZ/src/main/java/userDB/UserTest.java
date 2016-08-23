package userDB;

import java.util.Scanner;

/**
 * Created by WEO on 8/22/16.
 */
public class UserTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        UserService.dbCreate(scanner);

        UserService.bossSearch(scanner);
    }

}
