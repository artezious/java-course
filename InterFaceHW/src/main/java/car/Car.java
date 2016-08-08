package car;

/**
 * Created by WEO on 7/21/16.
 */
public abstract class Car implements Machine {

    String name;
    int speed;


    public Car(String name, int speed) {

        this.name = name;
        this.speed = speed;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    abstract String[] getCarInfo();

}
