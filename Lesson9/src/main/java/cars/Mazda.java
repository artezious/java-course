package cars;

import java.util.Objects;

/**
 * Created by WEO on 7/22/16.
 */
public class Mazda extends Car {

    private String color;

    public Mazda (int speed, String color) {

        super (speed);
        this.color = color;
    }
    public Mazda (int speed) {

        super (speed);
        this.color = color;
    }


    public void drive() {

        System.out.println("drive----");

    }

    public int getPassengerNumber() {
        return 0;
    }

    @Override
    public String toString() {
        if (color != null) {
            return "Mazda{" +
                    "color='" + color + '\'' +
                    "speed='" + getSpeed() + '\'' +
                    '}';
        } else {
            return "Mazda{" +
                    "speed='" + getSpeed() + '\'' +
                    '}';
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Mazda mazda = (Mazda) o;

        if (getSpeed() != mazda.getSpeed()) return false;

        return color != null ? color.equals(mazda.color) : mazda.color == null;

    }

}
