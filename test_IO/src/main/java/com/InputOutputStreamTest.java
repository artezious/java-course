package com;

import java.io.*;

/**
 * Created by WEO on 9/13/16.
 */
public class InputOutputStreamTest {
    public static void main(String[] args) throws IOException {
        File file = new File("3.txt");

        if (!file.exists()) {
            file.createNewFile();
        }

        String message = "Hello)";

        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(message.getBytes());
        fileOutputStream.flush();
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream(file);
        byte buf[] = new byte[1024];
        while (fileInputStream.read(buf)>0) {
            System.out.println(new String(buf));
        }
        fileInputStream.close();

    }
}
