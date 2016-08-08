package exceptionTest;

/**
 * Created by WEO on 8/2/16.
 */
public class ExceptionOverrideTest {
    public static void main(String[] args) {


    }
}

class Base {

    public void m1() throws Exception {

    }

}

class Child extends Base {

    @Override
    public void m1() {

    }
}

