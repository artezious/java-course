package com.test;

import com.models.ManagerEmpl;
import com.models.SimpleEmpl;
import com.service.SystemEmpManager;

import java.util.Arrays;
import java.util.Scanner;

public class SETest {

    public static void main(String[] args) {
        SimpleEmpl simpleEmpl = new SimpleEmpl();
        simpleEmpl.getName();

        Scanner scanner = new Scanner(System.in);

        SystemEmpManager empManager = new SystemEmpManager();

        for (int i = 0; i < 2; i++) {
            SimpleEmpl empl = new SimpleEmpl();

            System.out.println("Please enter name: ");
            String name = scanner.next();
            empl.setName(name);

            System.out.println("Please enter manager name: ");
            ManagerEmpl managerEmpl = new ManagerEmpl();
            String managerName = scanner.next();
            managerEmpl.setName(managerName);

            empl.setManager(managerEmpl);
            empManager.addNewEmpl(empl);

        }
        System.out.println(Arrays.toString(empManager.getSimplEmplDB()));

        for (SimpleEmpl empl : empManager.getSimplEmplDB()){
            System.out.println("name = " + empl.getName());
            System.out.println(" manager name = " + empl.getManager() == null ? "NOT FOUND NAME" : empl.getManager().getName());

        }
        ManagerEmpl[] testManagers = empManager.getAllManagersByName("Test_manager");
        System.out.println(Arrays.toString(testManagers));
    }
}
