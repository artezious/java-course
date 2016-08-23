package sort;

import java.util.Arrays;

/**
 * Created by WEO on 8/19/16.
 */
public class SortTest {

    public static void main(String[] args) {
        int mas[] = {32, 5, 3, 1, 1, 1, 2, 23, 1234, 2, 123};

        sortByChoice(mas);

        int mas1[] = {23,4124,125,-123,324,5,2,21,23,34,23,52,312,3};

        sortByBubble(mas1);

    }

    private static void sortByBubble(int[] mas1) {
        for (int i=0; i<mas1.length; i++) {
            for (int j=0; j<mas1.length; j++){
                if (mas1[i]<mas1[j]) {
                    int tmp = mas1[i];
                    mas1[i] = mas1[j];
                    mas1[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(mas1));
    }

    private static void sortByChoice(int[] mas) {
        for (int index = 0; index < mas.length; index++) {
            int minI = index;
            int min = mas[index];

            for (int j = index + 1; j < mas.length; j++) {
                if (mas[j] < min) {
                    minI = j;
                    min = mas[j];
                }
            }
            if (minI != index) {
                int tmp = mas[index];
                mas[index] = mas[minI];
                mas[minI] = tmp;
            }
        }

        System.out.println(Arrays.toString(mas));
    }

}
