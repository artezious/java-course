package cars;

import java.util.Arrays;

/**
 * Created by WEO on 7/22/16.
 */
public class CarTest {

    public static void main(String[] args) {

        Car[] cars = {new Mazda(135, "green"), new Mazda(200), new Opel(300), new Opel()};

        System.out.println(Arrays.toString(cars));

        printCarInfo(cars);

        System.out.println(cars[0].equals(cars[1]));


    }

    private static void printCarInfo(Car[] cars) {

        for (Car car : cars) {
            System.out.println(car.getSpeed());
            System.out.println(car.getClass().getName());
            System.out.println("instanceof Opel " + (car instanceof Opel));
            System.out.println("instanceof Mazda " + (car instanceof Mazda));
            System.out.println("instanceof Car " + (car instanceof Car));
            System.out.println("instanceof Machine " + (car instanceof Machine));
        }
    }
}

