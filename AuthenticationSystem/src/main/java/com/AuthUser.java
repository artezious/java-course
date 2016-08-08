package com;

/**
 * Created by WEO on 7/28/16.
 */
public class AuthUser extends UserBase {

    public AuthUser(String username, String password, int access) {
        super(username, password, access);
    }

    public static void userCommonMethod() {

        System.out.println("User privileges");
        System.out.println("1 - Calc");
    }
}
