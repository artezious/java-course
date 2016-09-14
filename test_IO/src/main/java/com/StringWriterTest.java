package com;

import java.io.StringWriter;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by WEO on 9/13/16.
 */
public class StringWriterTest {
    public static void main(String[] args) {
        StringWriter stringWriter = new StringWriter();

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            stringWriter.write(" " + number);
        }
        System.out.println("----> stringWriterBuf" + stringWriter.getBuffer());
    }
}
