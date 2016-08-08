package userBase;

import java.util.Arrays;

/**
 * Created by WEO on 8/8/16.
 */
public class UserDB {

    private User [] userDB = new User [0];

    public User[] getUserDB() {
        return userDB;
    }

    public void setUserDB(User[] userDB) {
        this.userDB = userDB;
    }

    public void addNewUser (User newUser) {

        userDB = Arrays.copyOf(userDB, userDB.length + 1);
        userDB[userDB.length - 1] = newUser;

    }

    @Override
    public String toString() {
        return "UserDB{" +
                "userDB=" + Arrays.toString(userDB) +
                '}';
    }
}
