package clone_test;

/**
 * Created by WEO on 8/23/16.
 */
public class CloneTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Empl empl = new Empl ("empl1");

        Empl emplClone = new Empl (empl.getName());
        System.out.println(empl.equals(emplClone));

        Empl emplClone2 = new Empl(empl);
        System.out.println(empl.equals(emplClone2));

        Empl clone = (Empl) empl.clone();

        System.out.println(empl.equals(clone));

    }


}

class Empl implements Cloneable {
    private String name;


    public Empl(Empl empl) {
        this.name = empl.getName();
    }

    public Empl(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Empl{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Empl)) return false;

        Empl empl = (Empl) o;

        return name != null ? name.equals(empl.name) : empl.name == null;

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
