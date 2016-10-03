package com;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by WEO on 10/2/16.
 */
public class Service extends Thread {

    public static int sumOfDigitsInFile(BufferedReader bufferedReader) throws IOException {
        int sumOfDigits = 0;
        String buf;
        while ((buf = bufferedReader.readLine()) != null) {
            for (int i = 0; i < buf.length(); i++) {
                if (Character.isDigit((int) buf.charAt(i))) {
                    sumOfDigits += Character.digit(buf.charAt(i), 10);
                }
            }
        } return sumOfDigits;
    }
}