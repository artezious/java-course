package remove_el_from_mas;

import java.util.Arrays;

/**
 * Created by WEO on 7/15/16.
 */
public class RemobeElFromMasTest {

    public static void main(String[] args) {
        int mas [] = {1,2,2,3,4,5};
        int indexForRemove = 2;
        int tailLength = mas.length - indexForRemove - 1;
        System.out.println(Arrays.toString(mas));
        System.arraycopy(mas, indexForRemove+1, mas, indexForRemove, tailLength);
        System.out.println(Arrays.toString(mas));
        mas = Arrays.copyOf(mas, mas.length-1);
        System.out.println(Arrays.toString(mas));
    }

}
