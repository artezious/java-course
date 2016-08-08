package com;

import java.util.Scanner;

/**
 * Created by WEO on 6/27/16.
 */
public class Min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input 3 numbers");
        System.out.print("A ");
        int a = scanner.nextInt();
        System.out.println();
        System.out.print("B ");
        int b = scanner.nextInt();
        System.out.println();
        System.out.print("C ");
        int c = scanner.nextInt();
        System.out.println();

        int min = a < b && b < c ? a : b < c ? b : c;
        //int min = mint < c ? mint : c;
            System.out.println(min);



        /*if ((a < b) & (a < c)) {
            System.out.println("Lowest is A and its equal to " +a);
        } else if ((b < a) & (b < c)) {
                System.out.println("Lowest is B and its equal to " +b);
            } else if ((c < a) & (c < b)) {
                    System.out.println("Lowest is C and its equal to " +c);
                } else {
                    System.out.println("Numbers are equal");
                }*/
    }
}
