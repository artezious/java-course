package innerClassTest;


/**
 * Created by WEO on 8/30/16.
 */
public class OuterClass {

    private int age = 12;

    public class InnerClass {

        private int age = 13;

        public void innerClassMethod(int age) {
            System.out.println(OuterClass.this.age);
            System.out.println("inner age" + this.age);
            System.out.println("hello from innerClassMethod" + age);
        }
    }

}

