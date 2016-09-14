package com;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by WEO on 9/13/16.
 */
public class FileTest {
    public static void main(String[] args) throws IOException {

        File file = new File ("/Users/WEO/JavaProjects/test_IO/");
        if (file.isDirectory()) {

            File[] files = file.listFiles(new FilenameFilter() {
                public boolean accept(File dir, String name) {
                    return name.contains(".xml");
                }
            });
            for (File f : files) {
                System.out.println("name = " + file.getName());
                System.out.println("r = " + f.canRead());
                System.out.println("w = " + f.canWrite());
            }
        }

    File file2 = new File("1.txt");
        if (!file2.exists()) {
            System.out.println("1.txt is not available");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Do you want to create this file?");
            String answer = scanner.nextLine();
            if (answer.equals("Y")) {
                file2.createNewFile();
            } else {
                file2.delete();
                System.out.println("Bye");
            }

        } else {
            System.out.println("1.txt is available");
        }

        File dir = new File("d1//d2//d3//d4");
        if (dir.exists()) {
            System.out.println("dir is available");
            deleteRec(new File ("d1"));
        } else {
            System.out.println("dir isnt available");
            dir.mkdirs();
        }
    }

    public  static void deleteRec(File rootDir) {
        if (rootDir.isDirectory()) {
            File [] files = rootDir.listFiles();

            for (File f : files) {
                deleteRec(f);
            }
        }
        rootDir.delete();

    }
}
