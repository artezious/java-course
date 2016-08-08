package polymorf.test;

import polymorf.model.Child;
import polymorf.model.Child1;
import polymorf.model.Child2;
import polymorf.model.Parent;

/**
 * Created by WEO on 7/15/16.
 */
public class polymorftest {

    public static void main(String[] args) {
  /*      Child child = new Child(12);/*
        Child child2 = new Child(13);

        // сравнение по ссылкам - использование вместоо  equals -> ==

        System.out.println(child == child2);

        // сравнение по контенту (содержимому)

        System.out.println(child.equals(child2));*/


        Parent[] childs = {new Child(10), new Child1(12), new Child2(13)};

        for (Parent childq : childs) {
            System.out.println(childq);
        }





    }

}
