package com;

/**
 * Created by WEO on 7/1/16.
 */
public class Strings {
    public static void main(String[] args) {


        String str1 = "4/2" + 4 / 2;
        String str2 = "4/2" + 4 / 2;

        System.out.println(str1 == str2);

        System.out.println("str1=" + str1.hashCode() + " -- str2= " + str2.hashCode());

        // изменение строк приводит к созданию нового объекта в памяти
        str1 = str1.concat("--");
        System.out.println(str1.hashCode());
        str2 = str2.concat("--");
        System.out.println(str1 == str2); // сравнение по ссылкам (адреса памяти)
        System.out.println(str1.equals(str2)); // сравнение по значению


        System.out.println("4/2=" + 4/2 == "4/2=2");

    }
}
