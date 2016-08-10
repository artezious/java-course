package com;

/**
 * Created by WEO on 8/9/16.
 */
public enum Role {

    ADMIN(),

    USER(777) {
        @Override
        public void printInfo() {
            System.out.println("user -> printInfoMethod");
        }

        @Override
        public String toString() {
            return "name = " + name();
        }
    };

    private int permission;

    Role(int permission) {
        this.permission = permission;
    }

    Role() {
        System.out.println("конструктор == role");
    }

    public static Role getRoleByPermission(int permissionForSearch) {
        Role roles[] = values(); // ADMIN, USER

        for (Role r : roles) {
            if (r.permission == permissionForSearch) {
                return r;
            }
        }
        throw new IllegalArgumentException("role with permission = " +
                permissionForSearch + " not found");
    }

    public void printInfo() {
        System.out.println("user -> printInfoMethod");
    }


}
