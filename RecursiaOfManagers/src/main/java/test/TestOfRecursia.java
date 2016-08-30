package test;

import models.BaseEmployee;
import models.Boss;
import models.Director;
import models.Manager;

public class TestOfRecursia {
    public static void main(String[] args) {
        //Создание сотрудника и пирамиды начальников
        BaseEmployee baseEmployee = new BaseEmployee("Chris", new Manager("Bob", new Director("Fred", new Boss("Tony"))));

        //Проверка объекта и его полей
        System.out.println(baseEmployee.printInfo());
        System.out.println(baseEmployee.boss.printInfo());
        System.out.println(baseEmployee.boss.boss.printInfo());
        System.out.println(baseEmployee.boss.boss.boss.printInfo());

        System.out.println("<-- recursia -->");
        //Вызов рекурсии
        System.out.println(printInfo(baseEmployee));
    }

    static String printInfo(BaseEmployee baseEmployee) {
 //       System.out.println(baseEmployee);//Для ловли ошибки: взятие босса у менеджера возвращает null
        System.out.println(baseEmployee.printInfo());
        if (baseEmployee instanceof Boss) {
            return null;
        }
        return printInfo(baseEmployee.getBoss());


    }

}
