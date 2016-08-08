package com;

import java.util.Scanner;

/**
 * Created by WEO on 7/6/16.
 */
public class CalcTest {
    public static void main(String[] args) {


    Calculator calculator = new Calculator();

    System.out.println("Please define amount of numbers to operate with: ");
    Scanner scanner = new Scanner(System.in);
    int amNumbers = scanner.nextInt();

    int numbers[] = new int[amNumbers];
    for (int i = 0; i < numbers.length; i++) {
        System.out.println("Please enter " + (i+1) + " number");
        numbers[i] = scanner.nextInt();
    }

    System.out.println("Please choose action: +/-/*/:");

    String action = scanner.next();

    switch (action) {
        case "+":
            System.out.println(calculator.add(numbers));
            break;
        case "-":
            System.out.println(calculator.sub(numbers));
            break;
        case "*":
            System.out.println(calculator.mul(numbers));
            break;
        case ":":
            System.out.println(calculator.div(numbers));
            break;
    }
    }

}
