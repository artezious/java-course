package exception_test.custom_exception;

/**
 * Created by WEO on 7/26/16.
 */
public class CustomExceptionTest {

    public static void main(String[] args) {

        CustomException customException = new CustomException();

        try{
          //  throw customException();
        } catch (RuntimeException e) {

            System.out.println(e.getMessage() + " --- ");

        } finally {
            System.out.println(" ---finally");
        }

    }
}
