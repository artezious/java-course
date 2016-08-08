package exception_test;

/**
 * Created by WEO on 7/26/16.
 */
public class Exception_test {

    public void step1(){
        System.out.println(" . start step1 ");
        step2();
        System.out.println(" . end step1 ");
    }

    private void step2() {
        System.out.println(" . . start step2 ");
        try {
        step3();
        }catch  (RuntimeException r) {
            System.out.println("---->runtime "+r.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(" . . end step2 ");
    }

    private void step3() {
        System.out.println(" . . . start step3 ");
        throw new RuntimeException("sorry");
        //System.out.println(" . . . end step3 ");
    }

    public static void main(String[] args) {
        Exception_test exceptionTest = new Exception_test();
        exceptionTest.step1();
    }

}
