package break_continue;

/**
 * Created by WEO on 7/22/16.
 */
public class BreakContinue {

    public static void main(String[] args) {

        int mas[] = {1, 5, 6, 84, 40, 3, 909};

        System.out.println("mas length " + mas.length);

        for (int i = 0; i < mas.length; i++) {

            System.out.println(mas[i]);
            if (mas[i] % 4 == 0) {
                break;
            }

        }

        int matrix[][] = {{1, 3, 12},
                {4, 6, 7},
                {7, 8, 9}};

        for (int row = 0; row < matrix.length; row++) {
            if ((row+1) % 2 == 0) continue;
            for (int col = 0; col < matrix[row].length; col++) {

                System.out.print(" " + matrix[row][col]);
            }
            System.out.println();
        }
        System.out.println();

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if ((col+1) % 2 == 0) continue;
                System.out.print(" " + matrix[row][col]);
            }
            System.out.println();
        }

    }


}
