package com;

import java.io.IOException;

import static com.ThreadInputAndCount.readFileaAndCount;
import static com.ThreadOutputFile.writeFile;

/**
 * Created by WEO on 10/2/16.
 */
public class TestThread extends Thread {

    public String fileName;

    public TestThread(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {

        try {
            writeFile(readFileaAndCount(fileName), fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
