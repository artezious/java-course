package com;

import java.util.Arrays;

public class MatAver {
    public static void main(String[] args) {
        int matsize = 15;
        int [] mat1 = new int [matsize];
        int [] mat2 = new int [matsize];
        int aver1 = 0;
        int aver2 = 0;


        for (int i=0; i < mat1.length; i++) {
            mat1[i] = (int)(Math.random()*(matsize+1));
            aver1 = mat1[i] + aver1;
            aver2 = mat2[i] + aver2;
        }

        System.out.println(Arrays.toString(mat1));
        System.out.println(Arrays.toString(mat2));

        aver1 = aver1/matsize;
        aver2 = aver2/matsize;

        if (aver1 > aver2) {
            System.out.println("Average of the 1st Array is greater and = "+aver1);
        } else if (aver1 < aver2) {
            System.out.println("Average of the 2nd Array is greater and = " +aver2);
        } else {
            System.out.println("Averages of two Arrays are equal and = " +aver1);
        }
    }

}



