package com;

/**
 * Created by WEO on 7/28/16.
 */
public class AuthAdmin extends UserBase {

    public AuthAdmin(String username, String password, int access) {
        super(username, password, access);
    }

    public static void adminCommonMethod() {

        System.out.println("Admin privileges");
        System.out.println("1 - Calc");
        System.out.println("2 - Preferences");
    }
}
