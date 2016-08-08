package cars;

/**
 * Created by WEO on 7/22/16.
 */
abstract public class Car implements Machine {

    private int speed;

    public Car (int speed) {

        this.speed = speed;

    }

 /*   public Car () {

        System.out.println(getClass().getName() + " :: constructor");

    }
*/

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        return speed == car.speed;

    }

}
