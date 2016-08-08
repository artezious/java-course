package com;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {


        int asize = (int) (Math.random() * 50 +5);
        int arr1[] = new int[asize];
        int arr2[] = new int[asize];
        int h = 0;

        for (int i = 0; i < asize; i++) {
            arr1[i] = (int) (Math.random() * 100);
            arr2[i] = (int) (Math.random() * 100);
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        for (int i = 0; i < asize; i++) {
              for (int j = 0; j < asize; j++) {
                    if (arr1[i] == arr2[j]) {
                        ++h;
                        break;
                    }
              }
        }

        if (h > 0) {
            System.out.println("Equals " + h);
            int merge[] = new int[h];
            for (int k = 0; k < h; k++) {
                for (int l = 0; l < asize; l++) {
                    for (int m = 0; m < asize; m++) {
                        if (arr1[l] == arr2[m]) {
                            merge[k++] = arr1[l];
                            break;
                        }
                    }
                }
            }
            System.out.println(Arrays.toString(merge));
        } else {
            System.out.println("Equals " +h);
        }
    }
}
