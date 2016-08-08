package testFamily;

import familyDB.Kid;
import familyDB.Parent;
import serviceFamily.FamilyService;

import java.util.Arrays;
import java.util.Scanner;

public class FamilyTest {

    public static final int FAM_MEMBERS_COUNT = 3;

    public static void main(String[] args) {

        System.out.println("Please enter " + FAM_MEMBERS_COUNT + " member");
        Scanner scanner = new Scanner(System.in);

        FamilyService famService = new FamilyService();

        for (int i = 1; i <= FAM_MEMBERS_COUNT; i++) {

            System.out.println(i + " member");

            Parent parMember = new Parent();
            Kid kidMember = new Kid();

            System.out.println("Name ");
            parMember.setName(scanner.next());
            System.out.println("Kid's Name ");
            kidMember.setName(scanner.next());


/*            System.out.println("Enter activity during picnic");
            parMember.setPicnicActivity(scanner.next());

            System.out.println("SurName ");
            String surName = scanner.next();
            parMember.setSurName(surName);


            System.out.println("DateBirth ");
            String dateBirth = scanner.next();
            parMember.setDateBirth(dateBirth);


            System.out.println("Address ");
            parMember.setHomeAddr(scanner.next());
*/


          /*  System.out.println("Enter Kids activity");
            kidMember.setPicnicActivity(scanner.next());

*/
            parMember.setKid(kidMember);
            famService.addNewParentMember(parMember);

        }
        for (int j = 0; j < FAM_MEMBERS_COUNT; j++) {
            System.out.println(famService.getParentMember()[j]);
        }
        System.out.println(Arrays.toString(famService.getParentMember()));

        System.out.println(Arrays.toString(famService.searchGrFather()));

        System.out.println("Please enter name of Parent to delete");
        String memberNametoDelete = scanner.next();
        System.out.println(Arrays.toString(famService.deleteMember(memberNametoDelete)));

    }
}
