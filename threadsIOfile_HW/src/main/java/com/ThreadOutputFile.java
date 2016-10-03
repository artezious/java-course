package com;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by WEO on 10/2/16.
 */
public class ThreadOutputFile extends Thread {

    private int sumOfDigits;
    private String fileName;

    public ThreadOutputFile(int sumOfDigits, String fileName) {
        this.sumOfDigits = sumOfDigits;
        this.fileName = fileName;
    }
    @Override
    public void run() {
        File fileOut = new File(fileName.concat("_sum"));
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileOut, true));
            bufferedWriter.write(sumOfDigits + "\n");
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Ошибка");
        }
    }
}