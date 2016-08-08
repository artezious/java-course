package user;

/**
 * Created by WEO on 7/8/16.
 */
public class User {
    private String name;
    private String surName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public static void main(String[] args) {
 //       System.out.println((new User("UserName", "UserSurName")));
        final User userRef1 = new User();
        System.out.println(userRef1);

        User userRef2 = new User();
        System.out.println(userRef2);
    }

}




