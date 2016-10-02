package com;

/**
 * Created by WEO on 10/2/16.
 */
public class TestProject {
    public static void main(String[] args) {

        TestThread testThread = new TestThread(args[0]);
        testThread.run();
    }
}
