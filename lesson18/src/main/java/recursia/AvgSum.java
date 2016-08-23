package recursia;

import java.util.Scanner;

/**
 * Created by WEO on 8/19/16.
 */
public class AvgSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double v = avgSum(0, 1, scanner);
        System.out.println(v);
    }

    public static double avgSum(int sum, int counter, Scanner scanner) {
        System.out.println("please input number");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            System.out.println("number= " + number + " sum= " + sum);
           return avgSum(sum + number, ++counter, scanner);
        }

        return sum / counter;

    }

}
