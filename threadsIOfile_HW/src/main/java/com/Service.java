package com;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by WEO on 10/2/16.
 */
public class Service extends Thread {


    static int sumOfDigitsInLine(String buf) {
        int sum = 0;
        for (int i = 0; i < buf.length(); i++) {
            if (Character.isDigit((int) buf.charAt(i))) {
                int x = Character.digit(buf.charAt(i), 10);
                sum += x;
            }
        }
        return sum;
    }

    public static int sumOfDigitsInFile(BufferedReader bufferedReader) throws IOException {
        int sumOfDigits = 0;
        String buf;
        while ((buf = bufferedReader.readLine()) != null) {
            sumOfDigits += Service.sumOfDigitsInLine(buf);
        }
        return sumOfDigits;
    }
}
