package com;

public class ArrayTest {
    public static void main(String[] args) {
       // int mas[] = {};
        int mas[] = {1,2,23,6,4,2324,234,23,57,4,74,5,45,7,457};
        int mas1[] = new int[4]; // прошу выделить память под 4 ячейки хранения

        System.out.println(mas1[0]);

        System.out.println("length= " +mas.length);
        System.out.println(mas[0]);
        System.out.println(mas[mas.length -1]);

       // int matrix[][] = new int [4][4]; // четко задано сколько строк и столбцов
        int matrix[][] = new int [4][]; // неизвестно сколько будет потом столбцов
        System.out.println(matrix[0]);
        matrix[0] = new int [2];        // беру строчку №1 (matrix[0]) и выделяю память для 2 столбцов (new int [2])
        System.out.println(matrix[0].length);

    }
}
