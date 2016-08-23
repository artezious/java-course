package recursia;

/**
 * Created by WEO on 8/19/16.
 */

public class BinarySearch {
    public static void main(String[] args) {

        int mas[] = {23, 4124, 125, -123, 324, 5, 2, 21, 23, 34, 23, 52, 312, 3};

        System.out.println(indexSearch(mas, 0, mas.length, 5));

    }

    public static int indexSearch(int mas[], int min, int max, int key) {

        int avgI = (max - min) / 2 + min;

        if (key == mas[avgI]) {
            return key;
        } else if (key > mas[avgI]) {

            return indexSearch(mas, avgI, max, key);
        } else {
            return indexSearch(mas, min, avgI, key);
        }


    }

}
