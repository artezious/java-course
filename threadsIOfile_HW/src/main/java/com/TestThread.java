package com;

import java.io.IOException;

import static com.ThreadInputAndCount.readFileaAndCount;

/**
 * Created by WEO on 10/2/16.
 */
public class TestThread extends Thread {

    private String fileName;

    public TestThread(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {

        ThreadOutputFile threadOutputFile = null;
        try {
            threadOutputFile = new ThreadOutputFile(readFileaAndCount(fileName), fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }

        assert threadOutputFile != null;
        threadOutputFile.start();

    }
}
