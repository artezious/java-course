package casting;

/**
 * Created by WEO on 7/15/16.
 */
public class CastingTest {

    public static void main(String[] args) {
        Parent p =  new Parent(); //new Child();
        p.commonMethod();


        if (p instanceof Child) {
            Child child = (Child) p;   // нисходящий кастинг
            child.uniqueChildMethod();
        }
    }

}

class Parent {

    public void commonMethod () {
        System.out.println("Parent common method");
    }

    @Override
    public String toString() {
        return "Parent {}";
    }
}


class Child  extends Parent{

    public void uniqueChildMethod() {
        System.out.println("uniqueChildMethod");
    }

    @Override
    public void commonMethod() {
        System.out.println("child:: commonmethod");
    }

    @Override
    public String toString() {
        return "Child {}";
    }
}
