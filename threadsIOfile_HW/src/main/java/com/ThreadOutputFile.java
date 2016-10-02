package com;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by WEO on 10/2/16.
 */
public class ThreadOutputFile extends Thread {

    public static void writeFile(int sumOfDigits, String fileName) throws IOException {
        File fileOut = new File(fileName.concat("_sum"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileOut, true));
        bufferedWriter.write(sumOfDigits + "\n");
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}