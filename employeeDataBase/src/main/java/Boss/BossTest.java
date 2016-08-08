package Boss;

import java.util.Arrays;
import java.util.Scanner;

public class BossTest {

    public static void main(String[] args) {

        Boss bossSearch = new Boss();
        Employee emplAdd = new Boss();
        Scanner scanner = new Scanner(System.in);

        for (byte term = 0; term < 1; term--) {

            System.out.println("Please choose action ");
            System.out.println("1 - Add data");
            System.out.println("2 - Search DataBase");
            System.out.println("3 - View DataBase");
            System.out.println("4 - Exit");

            byte action = scanner.nextByte();

            switch (action) {
                case (1):

                    System.out.println("Please enter Sirname");
                    emplAdd.setEmpSirName(scanner.next());
                    System.out.println("Please enter Name");
                    emplAdd.setEmpName(scanner.next());
                    System.out.println("Please enter Position");
                    emplAdd.setEmpPosition(scanner.next());
                    System.out.println("Please enter Salary");
                    emplAdd.setEmpSalary(scanner.next());
                    System.out.println("Please enter Chief");
                    emplAdd.setEmpBoss(scanner.next());
                    System.out.println("Please enter Chief's TelNumber");
                    bossSearch.setTelNumber(scanner.next());

                    break;

                case (2):
                    System.out.println("Please enter Chief name");
                    String bossName = scanner.next();
                    if (bossSearch.getEmpBoss().equals(bossName)) {
                        String[] bossEmplData = {bossSearch.getEmpName() + bossSearch.getEmpSirName() + bossSearch.getEmpPosition() + bossSearch.getEmpSalary()};
                        System.out.println(Arrays.toString(bossEmplData));
                    }
                    break;
                case (3):
                    String[] dataBase = {bossSearch.getEmpName() + bossSearch.getEmpSirName() + bossSearch.getEmpPosition() + bossSearch.getEmpSalary() + bossSearch.getTelNumber()};
                    System.out.println(Arrays.toString(dataBase));
                    break;
                case (4):
                    term = 2;
                    break;
            }
        }
    }
}

