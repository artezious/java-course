package com;

import java.util.Arrays;

/**
 * Created by WEO on 7/5/16.
 */
public class MasMerge {
    public static void main(String[] args) {

        int mas1[] = {1, 2, 3, 4, 67, 8, 5, 4, 32, 423, 42};
        int mas2[] = {2, 3, 4, 5, 12, 23, 5536, 3, 2, 1,};
        int mas3[] = new int[0];

        for (int i = 0; i < mas1.length; i++) {
            for (int j = 0; j < mas2.length; j++) {
                if (mas1[i] == mas2[j]) {
                    mas3 = Arrays.copyOf(mas3, mas3.length + 1);
                    mas3[mas3.length - 1] = mas1[i];
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(mas3));

    }
}
