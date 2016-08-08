package com;

/**
 * Created by WEO on 6/24/16.
 */
public class SwitchTest {

    public static void main(String[] args) {

        int key = 30;                               // может быть и String
        switch (key) {
            default:
                System.out.println("default");
                break;
            case 1:
            case 30:
            System.out.println("1 and 30");
            break;
            case 2:
            System.out.println("2");
            break;
            case 3:
            System.out.println("3");
            break;
            case 9:
            System.out.println("9");
            break;
        }
    }
}
