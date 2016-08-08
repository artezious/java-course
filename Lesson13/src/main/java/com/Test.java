package com;

/**
 * Created by WEO on 8/2/16.
 */
public class Test {

private String name;

    public static void main(String[] args) {
        System.out.println(new Test().name);
        Child2 ch = new Child2();
        System.out.println(ch.element);
    }

    public void printInfo() {
        String msg;
  //      System.out.println(msg);
    }




}

class Base {
    Base () {
        System.out.println("base : constructor");
    }
}

class Child1 extends Base {
    Child1() {
        System.out.println("child: constructor");
    }
}

class Child2 extends Child1 {

    public Element element = new Element();

    Child2 () {
        System.out.println("child2: constructor");
    }
}

class Element {
    Element () {
        System.out.println("element: constructor");
    }
}
