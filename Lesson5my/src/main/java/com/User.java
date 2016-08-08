package com;

import com2.Calculator;

/**
 * Created by WEO on 7/5/16.
 */
class User {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum = calculator.add(1,3);
        System.out.println("Sum = " +sum);

        Calculator.printSomeMessage("via class");
        calculator.printSomeMessage("via object");

        System.out.println(calculator.add());       // вызов метода без параметров


        Calculator calculator2 = new Calculator(13,23);
        System.out.println(calculator2.add());

        DoNothing doNothing = new DoNothing();
        System.out.println(doNothing);

    }
}
