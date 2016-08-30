package models;

public class Director extends Manager {
    public Boss boss;
    private String name;

    public Director(String name, Boss boss) {
        super();
        this.name = name;
        this.boss = boss;
    }

    public Director() {

    }

    public String printInfo() {
        return "I am director. My name is " + this.name;
    }

    @Override
    public Boss getBoss() {
        return boss;
    }
}
