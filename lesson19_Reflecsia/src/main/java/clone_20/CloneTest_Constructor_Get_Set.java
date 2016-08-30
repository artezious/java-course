package clone_20;

/**
 * Created by WEO on 8/26/16.
 */
public class CloneTest_Constructor_Get_Set {
    public static void main(String[] args) {
        User user = new User("n1", "n1");


        // клонирование через конструктор
        User user2 = new User(user.getName(), user.getSurName());

        System.out.println(user.equals(user2));

        System.out.println("hash for user1 = " + user.hashCode());
        System.out.println("hash for user2 = " + user2.hashCode());

        // или второй вариант
        User user4 = new User(user2);
        System.out.println(user4);


        // клонирование через get/set
        User user3 = new User();
        user3.setName(user.getName());
        user3.setSurName(user.getSurName());
        System.out.println(user3);

    }
}
