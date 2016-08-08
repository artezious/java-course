package com.test;

import com.models.UserBase;
import com.service.UserCredPropertiesService;
import com.service.UserService;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by WEO on 7/29/16.
 */
public class UserTest {

    public static void main(String[] args) throws IOException {

        UserService userService = new UserService();

        UserCredPropertiesService adminpropertiesService = new UserCredPropertiesService("/admin.properties", UserBase.ADMIN_ROLE);
        adminpropertiesService.init();
        UserCredPropertiesService userpropertiesService = new UserCredPropertiesService("/user.properties", UserBase.USER_ROLE);
        userpropertiesService.init();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            String userName = scanner.next();
            String passWord = scanner.next();

            UserBase userBase = new UserBase(userName, passWord);
            userService.setUserRoleByPropertiesService(adminpropertiesService,userBase);
            userService.setUserRoleByPropertiesService(userpropertiesService, userBase);
            userService.addNewUser(userBase);
        }

        System.out.println(Arrays.toString(userService.getUserBaseDB()));

    }

}
