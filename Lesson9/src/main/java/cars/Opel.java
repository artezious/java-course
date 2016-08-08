package cars;

/**
 * Created by WEO on 7/22/16.
 */
public class Opel extends Car {

    public Opel (){

     super(Machine.SPEED);

    }

    public Opel(int speed) {

        super (speed);

    }


    public void drive() {

        System.out.println("drive----");

    }

    public int getPassengerNumber() {
        return 0;
    }


}
