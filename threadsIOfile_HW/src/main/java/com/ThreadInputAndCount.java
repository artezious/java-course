package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import static com.Service.sumOfDigitsInFile;

/**
 * Created by WEO on 10/2/16.
 */
public class ThreadInputAndCount extends Thread {


    public static int readFileaAndCount(String fileName) throws IOException {
        File fileIn = new File(fileName);
        FileReader fileReader = new FileReader(fileIn);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int sum = sumOfDigitsInFile(bufferedReader);
        bufferedReader.close();
        fileReader.close();
        return sum;
    }
}