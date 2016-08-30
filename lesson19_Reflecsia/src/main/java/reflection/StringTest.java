package reflection;

import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * Created by WEO on 8/23/16.
 */
public class StringTest {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        String str = "test";

        for (int i=0; i<10;i++) {
            str.concat("asdasdqdqw");
        }

        System.out.println(str.hashCode());
        str = str.concat("1");
        System.out.println(str);
        System.out.println(str.hashCode());

        /// делаем строчку изменяемую по значанию но без изменения области памяти

        String str1 = "test";
        Class strClass = str1.getClass();
        Field strClassDeclaredField = strClass.getDeclaredField("value");

        strClassDeclaredField.setAccessible(true);
        char [] value = (char []) strClassDeclaredField.get(str);
        System.out.println(Arrays.toString(value));

   //     strClassDeclaredField.set(str, new char[] {'t','e','s','t'}); или
        strClassDeclaredField.set(str,"test".toCharArray());

        System.out.println(str);
        System.out.println(str.hashCode());


    }

}
