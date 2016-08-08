package emp_var_2;

public class Empl {
    private String name;
    private String surName;
    private Empl manager;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public Empl getManager() {
        return manager;
    }

    public void setManager(Empl manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "Empl{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", manager=" + (manager == null ? manager : manager.getName()) +
                "}";
    }
}
