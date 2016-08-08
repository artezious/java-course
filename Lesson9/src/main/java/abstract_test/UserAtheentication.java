package abstract_test;

/**
 * Created by WEO on 7/19/16.
 */
public abstract class UserAtheentication {

    public String getUserRoleByUserName (String userName) {
        return "userName";
    }

    public abstract void changeUserRole (String role);

   /* public static void main(String[] args) {
//        new UserAtheentication(); //нельзя т.к. абстракнтый класс

        UserAuthenticationChild child = new UserAuthenticationChild();
        child.changeUserRole("Admin");


        UserAuthenticationChild userAuthenticationChild = child;


    }*/


}
