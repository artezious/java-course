package package2;

public class Calculator {

    private int number1;
    private int number2;

    public Calculator() {
        number1 = 12;
        number2 = 10;
        System.out.println("Calculator :: constructor");
    }

    public Calculator(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int add() {
        return number1 + number2;
    }


    public static void printSomeMessage(String msg) {
        System.out.println(msg);
    }
//    public void add(int a1, int b1) {
//        //return a+b;
//    }

}
