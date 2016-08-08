package package1;

import package2.Calculator;

class User {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int number1 = 1;
        int number2 = 3;
        calculator.add(number1, number2);

        Calculator.printSomeMessage("via class");
        calculator.printSomeMessage("via object");
        System.out.println(calculator.add());


        Calculator calculator2 = new Calculator(13, 23);
        System.out.println(calculator2.add());
        // System.out.println("sum = " + sum);

        DoNothing doNothing = new DoNothing();
        System.out.println(doNothing);
    }
}

class Admin {}

class Teacher {}