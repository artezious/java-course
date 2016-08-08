package com;

import java.util.Scanner;

/**
 * Created by WEO on 6/24/16.
 */
public class MainTest {
    public static void main(String[] args) {

        int mas[] = {1,2,3,45,6,7,8,9,9,5,3,4,5,4,3,2};

        for (int i = 0; i < mas.length; i++) {
            System.out.println("mas [" + i + "]= " + mas[i]);

            mas[i]*=2;
        }

        for (int tmp : mas){
            System.out.println(tmp);
        }

        Scanner scanner = new Scanner(System.in);
        int userMass[] = new int [5];
        System.out.println("Please input values for mas:");

        for (int i = 0; i < userMass.length; i++) {
            userMass[i] = scanner.nextInt();

        }

    }
}
