package models;

public class Boss extends Director {
    private String name;

    public Boss(String name) {
        //super();
        this.name = name;
    }

    public Boss() {

    }

    public String printInfo() {
        return "I am Boss. My name is " + this.name ;
    }
}
