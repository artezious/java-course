package models;

public class Manager extends BaseEmployee{
    public Director boss;
    private String name;

    public Manager(String name, Director director) {
        super();
        this.name = name;
        this.boss = director;
    }

    public Manager() {

    }

    public String printInfo() {
        return "I am manager. My name is " + this.name ;
    }

    @Override
    public Director getBoss() {
        return boss;
    }
}
