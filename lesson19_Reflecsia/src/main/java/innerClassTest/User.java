package innerClassTest;

/**
 * Created by WEO on 8/30/16.
 */
public class User implements Man {

    public void run() {
        class MethodClass {
            public void recalculate() {

            }
        }

        new MethodClass().recalculate();
    }
}
