package com;

import com.sun.xml.internal.ws.encoding.SwACodec;

/**
 * Created by WEO on 8/9/16.
 */
public class RoleEnumTest {

    public static void main(String[] args) {
        Role role = Role.ADMIN;
        printEnumDetails(role);

        role = Role.USER;
        printEnumDetails(role);

        enumValuesOutput();

        String roleAsString = /*null;*/ "ADMIN";

        role = Role.valueOf(roleAsString);

        switch (role) {
            case ADMIN:
                System.out.println("admin");
                break;
            case USER:
                System.out.println("user");
                break;
        }

        Role.USER.printInfo();

        Role roleByPermission = Role.getRoleByPermission(777);
        System.out.println(roleByPermission);

        Role roleByPermission1 = Role.getRoleByPermission(-1); // вызовет ошибку; чтобы исправить - деф роль дополнительную объявить
        System.out.println(roleByPermission1);

    }



    private static void enumValuesOutput() {
        Role[] values = Role.values();

        for (Role r : values) System.out.println(r);
    }

    private static void printEnumDetails(Role role) {
        System.out.println(role.name());
        System.out.println(role.ordinal());
    }

}
