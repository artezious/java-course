package recursia;

/**
 * Created by WEO on 8/19/16.
 */
public class Recursia {

    public static void main(String[] args) {


        for (int i = 1; i <= 15; i++) {
            System.out.print(i + " ");
        }
        int count = 0;
        System.out.println("for");

        while (true) {
            System.out.print(++count + " ");
            if (count >= 15) break;
        }
        System.out.println("while");

        printNumbers(1);
        System.out.println("recursia");
    }


    static void printNumbers(int numberForPrint) {
        System.out.print(numberForPrint + " ");
        if (numberForPrint < 15) {
            printNumbers(++numberForPrint);
        }
  //      System.out.print(numberForPrint + " "); // Демонстрация работы рекурсии
    }

}
