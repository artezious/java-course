package exception_test;

import java.io.FileNotFoundException;

/**
 * Created by WEO on 7/26/16.
 */
public class CheckedException_Test {

    public void step1() throws FileNotFoundException {
        System.out.println(" . start step1 ");
        step2();
        System.out.println(" . end step1 ");
    }

    private void step2() throws FileNotFoundException {
        System.out.println(" . . start step2 ");
        step3();
        System.out.println(" . . end step2 ");
    }

    private void step3() throws FileNotFoundException {
        System.out.println(" . . . start step3 ");
        throw new FileNotFoundException("sorry");
        //System.out.println(" . . . end step3 ");
    }

    public static void main(String[] args) {
        CheckedException_Test exceptionTest = new CheckedException_Test();
        try {
            exceptionTest.step1();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

}
