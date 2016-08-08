package com;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by WEO on 6/21/16.
 */
public class HelloWorld {

    public static void main(String[] args) {

        if (args.length !=2) {
            System.out.println("Please enter 2 digits");
        } else {
            int sum = Integer.valueOf(args[0]) + Integer.valueOf(args[1]);
            System.out.println(sum);
        }

        System.out.println("Hello World! " +args[0] +" " +args[1]);

    }

}
