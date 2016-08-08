package com;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by WEO on 7/28/16.
 */
public class Authentication_Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username");
        String username = scanner.next();
        System.out.println("Enter password");
        String password = scanner.next();


        AuthenticationClass authentication = new AuthenticationClass(username, password);

        try {
            authentication.accessTest();
        } catch (RuntimeException r) {
            System.out.println(r.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
