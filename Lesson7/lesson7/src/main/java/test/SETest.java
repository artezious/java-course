package test;

import com.models.ManagerEmpl;
import com.models.SimpleEmpl;
import com.service.SystemEmpManager;

import java.util.Arrays;
import java.util.Scanner;

public class SETest {

    public static final int EMP_COMMON_NUMBER = 1;

    public static void main(String[] args) {
        SimpleEmpl simpleEmpl = new SimpleEmpl();
        simpleEmpl.getName();

        Scanner scanner = new Scanner(System.in);
        SystemEmpManager empManager = new SystemEmpManager();

        for (int i = 0; i < EMP_COMMON_NUMBER; i++) {

            SimpleEmpl empl = new SimpleEmpl();//создание сотрудника
            System.out.println("Please input name: ");
            String name = scanner.next();
            empl.setName(name);

            System.out.println("please input manager name");
            ManagerEmpl managerEmpl = new ManagerEmpl();
            String managerName = scanner.next();
            managerEmpl.setName(managerName);

            empl.setManager(managerEmpl);
            empManager.addNewEmpl(empl);
        }

        System.out.println(Arrays.toString(empManager.getSimpleEmplDB()));

        for(SimpleEmpl empl : empManager.getSimpleEmplDB()) {
            System.out.println("name = " + empl.getName());
            System.out.println("manager name = " +
                    empl.getManager() == null ? "NOT FOUND MNAME" : empl.getManager().getName());
        }

        ManagerEmpl[] testManagers = empManager.getAllManagersByName("Test_manager");
        System.out.println(Arrays.toString(testManagers));

    }

}
