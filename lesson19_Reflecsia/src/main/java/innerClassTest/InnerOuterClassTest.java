package innerClassTest;

/**
 * Created by WEO on 8/30/16.
 */
public class InnerOuterClassTest {
    public static void main(String[] args) {

         new OuterClass().new InnerClass().innerClassMethod(4);

        /*       или более широкая запись
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();*/

        new Man() {
            public void run() {

            }
        };
    }
}
