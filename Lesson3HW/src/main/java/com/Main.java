package com;

/**
 * Created by WEO on 6/27/16.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(args.length);

       int i = 0;

        i = -+(10 + 2 + --i);
        System.out.println(i);
    }
}
