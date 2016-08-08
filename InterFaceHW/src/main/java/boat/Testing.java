package boat;

/**
 * Created by WEO on 7/21/16.
 */
public class Testing {

    static String name = "Ship";
    static String speed = "101";
    static String range = "90";
    static String name1 = "Raft";
    static String speed1 = "101";
    static String range1 = "90";


    public static void main(String[] args) {

        Ship ship1 = new Ship(name, speed, range);
        Raft raft1 = new Raft(name1, speed1, range1);

        System.out.println(ship1.getBoatName());
        System.out.println(raft1.getBoatName());


    }


}
