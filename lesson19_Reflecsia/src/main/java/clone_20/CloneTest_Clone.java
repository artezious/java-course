package clone_20;

/**
 * Created by WEO on 8/26/16.
 */
public class CloneTest_Clone {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User("name", "surname");
        Company company = new Company("XXX");
        user.setCompany(company);


        User clone = (User) user.clone();
        System.out.println("контент " + user.equals(clone)); // контент
        System.out.println("область памяти " + (user == clone));      // область памяти

        System.out.println(user);
        System.out.println(clone);

        System.out.println(user.getCompany() == clone.getCompany());

        user.getCompany().setCompanyName("YYY");
        System.out.println(clone.getCompany());



    }
}
