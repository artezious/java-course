package emp_var_2;

import java.util.Arrays;
import java.util.Scanner;

public class EmplTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empl[] empls = new Empl[0];
        for (int i = 0; i < 2; i++) {
            //создание сотрудника
            Empl empl = new Empl();
            String name = scanner.next();
            empl.setName(name);
            //создание менеджера
            Empl manager = new Empl();
            String managerName = scanner.next();
            manager.setName(managerName);

            //связка сотрудника с менеджером
            empl.setManager(manager);
            //выделение памяти - база сотрудников
            empls = Arrays.copyOf(empls, empls.length + 1);
            //внесение нового сотрудника в базу(условно сохранение)
            empls[empls.length - 1] = empl;
        }

        for (Empl empl : empls) {
            System.out.println(empl);
        }

        //search boss by name
        String searchBossName = "13";
        for (Empl empl : empls) {
            Empl manager = empl.getManager();
            if (manager != null) {
                if (searchBossName.equals(manager.getName())) {
                    System.out.println(manager);
                }
            }
        }
    }
}
