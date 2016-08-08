package com;

/**
 * Created by WEO on 6/24/16.
 */
public class MatrixTest {
    public static void main(String[] args) {
        int matrix[][] = new int [4][4];

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(" " + matrix[row][column]);
            }
            System.out.println();
        }

        int triangleMatrix[][] =    {{1},
                                    {2, 3},
                                    {4, 5, 6},
                                    {7, 8, 9}};
        for (int row = 0; row < triangleMatrix.length; row++) {
            for (int column = 0; column < triangleMatrix[row].length; column++) {
                System.out.print(" "+ triangleMatrix[row][column]);
            }
            System.out.println();
        }
    }

}
