package com;

import java.io.*;
import java.util.Scanner;

/**
 * Created by WEO on 9/13/16.
 */
public class WriterReaderTest {

    public static void main(String[] args) throws IOException {

        File file = new File("2.txt");

        if (!file.exists()) {
            file.createNewFile();
        }

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));

        Scanner scanner = new Scanner(System.in);
        String buffer;
        while (!(buffer = scanner.nextLine()).equals("STOP")) {
            bufferedWriter.write(buffer +"\n");
            bufferedWriter.flush();
        }
        bufferedWriter.close();

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);


        String buf;
        while ((buf = bufferedReader.readLine()) != null) {

            System.out.println(buf);

        }
        bufferedReader.close();


    }

}
