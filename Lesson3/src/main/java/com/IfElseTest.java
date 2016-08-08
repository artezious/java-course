package com;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.awt.image.SinglePixelPackedSampleModel;
import java.nio.channels.Pipe;
import java.util.Scanner;

/**
 * Created by WEO on 6/24/16.
 */
public class IfElseTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input number");
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }

      //  int num1 = (num > 0) ? 1 : 0;
      //  System.out.println(num1);

        System.out.println("Please input a");
        int a = scanner.nextInt();
        System.out.println("Please input b");
        int b = scanner.nextInt();

        int min = a < b ? a : b;
        System.out.println("Min = " +min);


    }
}
