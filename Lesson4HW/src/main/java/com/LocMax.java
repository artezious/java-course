package com;

import java.util.Arrays;


public class LocMax {
    public static void main(String[] args) {

        int matsize = (int)(Math.random()*200);
        int array [] = new int [matsize];

        for (int i = 0; i < matsize; i++) {
            array [i] = (int)(Math.random()*200);
        }

        System.out.println(Arrays.toString(array));

        for (int i = 1; i < matsize-1; i++) {
            if ((array[i] > array[i-1]) && (array[i] > array[i+1])) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
