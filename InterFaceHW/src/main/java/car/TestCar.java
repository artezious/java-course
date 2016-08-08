package car;


import java.util.Arrays;

/**
 * Created by WEO on 7/21/16.
 */
public class TestCar extends Car {

    private static String nameOfCar = "ASTON";
    private static int speedOfCar = 200;

    public TestCar(String nameOfCar, int speedOfCar) {

        super(nameOfCar, speedOfCar);

    }

    public String[] getCarInfo() {

        String infoOfCar[] = {Integer.toString(Car.MINSPEED), Integer.toString(Car.MAXSPEED), Car.MINPASSAMOUNT, Car.MAXPASSAMOUNT};

        return infoOfCar;

    }

    public static void main(String[] args) {

        TestCar testing = new TestCar(nameOfCar, speedOfCar);

        System.out.println(testing.getName());
        System.out.println(testing.getSpeed());


        System.out.println(Arrays.toString(testing.getCarInfo()));


    }

}
