package reflection;

/**
 * Created by WEO on 8/23/16.
 */
public class User {

    private String name;
    private String surName;

    public User() {

    }

    public User(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    private void privateMethod (String someValue) {
        System.out.println("private --> security with parameter: " + someValue);
    }

    public void publicUserMethod (String someValue) {
        System.out.println("public user method" + someValue);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }
}
