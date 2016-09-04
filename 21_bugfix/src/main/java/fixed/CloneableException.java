package fixed;

public class CloneableException {
    public static void main(String[] args) throws CloneNotSupportedException {


        Car car = new Car("Red");

        Car carClone = (Car) car.clone();

        System.out.println(car);
        System.out.println(carClone);

        //please provide possibility to clone Car model
    }

    static class Car implements Cloneable {
        private String color;

        public Car() {
        }

        public Car(String color) {
            this.color = color;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Car)) return false;

            Car car = (Car) o;

            return color != null ? color.equals(car.color) : car.color == null;

        }

        @Override
        public int hashCode() {
            return color != null ? color.hashCode() : 0;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            Car carClone = (Car) super.clone();
            return carClone;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "color='" + color + '\'' +
                    '}';
        }
    }
}
