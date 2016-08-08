package com;

import java.util.Arrays;


public class TrianglePascal {
    public static void main(String[] args) {
        double matrix[][] = new double [5][];

        for (int row = 0; row < matrix.length; row++){
            matrix[row] = new double[row+1];
            for (int col = 0; col < matrix[row].length; col++) {
                if (col == 0 || col == matrix[row].length - 1) {
                    matrix[row][col] = 1;
                } else {
                    matrix[row][col] =  matrix[row-1][col-1] +
                                        matrix[row-1][col];
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

    }


}
