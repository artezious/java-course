package com;

/**
 * Created by WEO on 7/1/16.
 */
public class Matrix_Arrays {

    public static void main(String[] args) {
        int matrix [][] = new int [4][4];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int trmatrix [][] = new int[][] {
                {1},
                {1,1},
                {1,1,1},
                {1,1,1,1}
        };

        for (int i = 0; i < trmatrix.length; i++) {
            for (int j = 0; j < trmatrix[i].length; j++) {

                System.out.print(trmatrix[i][j] + " ");
            }
            System.out.println();
        }

        int trMatrix2[][] = new int[4][];
        for (int row = 0; row < trMatrix2.length; row++) {
            trMatrix2[row] = new int[row+1];
            for (int col = 0; col < trMatrix2[row].length; col++) {
                trMatrix2[row][col] = 2;
            }
        }
        for (int i = 0; i < trMatrix2.length; i++) {
            for (int j = 0; j < trMatrix2[i].length; j++) {
                System.out.print(trMatrix2[i][j] + " ");
            }
            System.out.println();
        }



        }



    }
