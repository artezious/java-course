package com;

/**
 * Created by WEO on 6/24/16.
 */
public class Cycles {
    public static void main(String[] args) {

        for (int i = 0; i <= 3; i++) {
            System.out.println("Hello World!");
        }

        int j = 4;
        while (j-- > 0) {                           //постфиксная форма уменьшит j при следующем обращении
            System.out.println("AbraKadaaaaabra");
        }

        int k = 4;
        do {
            System.out.println("TERERERERER");
        } while(k-- > 0);                           // этот цикл проверяет условие после исполнения
    }
}
