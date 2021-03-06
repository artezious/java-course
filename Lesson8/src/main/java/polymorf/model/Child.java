package polymorf.model;

/**
 * Created by WEO on 7/15/16.
 */
public class Child extends Parent {

    public Child (int age) {
        this.age = age;
    }


    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Child{" +
                "age=" + age +
                '}';


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;  // аналогично ситуации, когда происходит сравнение типа child.equals(child)
        if (o == null || getClass() != o.getClass()) return false;

        Child child = (Child) o;

        return age == child.age;

    }

    @Override
    public int hashCode() {
        return age;
    }
}
