package recursia;

/**
 * Created by WEO on 8/19/16.
 */
public class Fibonacci {

    public static int fibonacci(int n) {


        return n < 2 ? 1 : fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(50));
    }

}
