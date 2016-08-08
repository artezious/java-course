package com2;

/**
 * Created by WEO on 7/5/16.
 */
public class Calculator {

    private int number1;
    private int number2;

    public Calculator(){                                  // Конструктор
       number1 = 12;
       number2 = 10;
       System.out.println("Calculator :: constructor");
    }

    public Calculator(int number1, int number2){
        this.number1 = number1;
        this.number2 = number2;
    }

    public int add (int a, int b) {
        return a + b;
    }

    public int add() {
        return number1 + number2;
    }

    public static void printSomeMessage(String str){
        System.out.println(str);
    }

}
