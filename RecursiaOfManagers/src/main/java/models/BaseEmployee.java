package models;

public class BaseEmployee {
    public Manager boss;
    private String name;

    public BaseEmployee(String name, Manager manager) {
        this.name = name;
        this.boss = manager;
    }

    public BaseEmployee() {

    }

    public String printInfo() {
        return "I am employee. My name is " + this.name ;
    }

    public Manager getBoss() {
        return boss;
    }
}
