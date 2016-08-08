package com;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

public class CheckDif {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input 2 Digits");
        System.out.print("A ");
        int a = scanner.nextInt();
        System.out.println();
        System.out.print("B ");
        int b = scanner.nextInt();
        System.out.println();

        int dif = a==b ? (a+b) : 0;
        System.out.println("A " +dif);
        System.out.println("B " +dif);

    }
}
