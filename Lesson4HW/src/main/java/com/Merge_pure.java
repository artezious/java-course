package com;

import java.util.Arrays;

public class Merge_pure {
    public static void main(String[] args) {

        int asize = (int) (Math.random() * 30 +5);
        int arr1[] = new int[asize];
        int arr2[] = new int[asize];

        for (int i = 0; i < asize; i++) {
            arr1[i] = (int) (Math.random() * 50);
            arr2[i] = (int) (Math.random() * 50);
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

            for (int i = 0; i < asize; i++) {
                for (int j = 0; j < asize; j++) {
                    if (arr1[i] == arr2[j]) {
                        System.out.print(arr1[i] + " ");
                    }
                }
            }
    }
}
