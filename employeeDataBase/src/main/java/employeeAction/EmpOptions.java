package employeeAction;

import employeeDataBase.EmpAddData;

import java.util.Scanner;

public class EmpOptions {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input empl numbers ");
        int commonNumberOfEmpl = scanner.nextInt();

        EmpAddData addData = new EmpAddData(commonNumberOfEmpl);

        for (byte term = 0; term < 1; term--) {

            System.out.println("Please choose action ");
            System.out.println("1 - Add data");
            System.out.println("2 - Search DataBase");
            System.out.println("3 - View DataBase");
            System.out.println("4 - Exit");

            byte action = scanner.nextByte();


            switch (action) {
                case (1):

                    for (int n = 0; n < commonNumberOfEmpl; n++) {
                        int i = 0;

                        String[] add = new String[5];

                        System.out.println("Please enter Sirname");
                        add[i++] = scanner.next();
                        System.out.println("Please enter Name");
                        add[i++] = scanner.next();
                        System.out.println("Please enter Position");
                        add[i++] = scanner.next();
                        System.out.println("Please enter Salary");
                        add[i++] = scanner.next();
                        System.out.println("Please enter Chief");
                        add[i++] = scanner.next();
                        addData.addNewEmplToDB(add);
                    }
                    break;

                case (2):
                    System.out.println("Please enter Chief name");
                    String chiefName;
                    chiefName = scanner.next();
                    addData.searchDataBaseEntities(chiefName);
                    break;
                case (3):
                    System.out.println("all empl data");
                    addData.printDataBaseEntities();
                    break;
                case (4):
                    term = 2;
                    break;
            }
        }

    }
}
