package serviceFamily;

import familyDB.Kid;
import familyDB.Parent;

import java.util.Arrays;


public class FamilyService {

    private Parent[] parentMember = new Parent[0];

    public Parent[] getParentMember() {
        return parentMember;
    }

    public void setParentMember(Parent[] parentMember) {
        this.parentMember = parentMember;
    }

    public void addNewParentMember(Parent parent) {

        parentMember = Arrays.copyOf(parentMember, parentMember.length + 1);
        parentMember[parentMember.length - 1] = parent;

    }

    public String[] searchGrFather() {

        String[] grandFathers = new String[0];
        int grandFatherCounter = 0;

        for (Parent parent : parentMember) {
            for (Parent grFather : parentMember) {
                if (parent.getKid().getName().equals(grFather.getName()) && parent.getName() != grFather.getName()) {
                    grandFathers = Arrays.copyOf(grandFathers, grandFathers.length + 1);
                    grandFathers[grandFatherCounter++] = parent.getName();
                }
            }
        }
        return grandFathers;
    }

    public Parent [] deleteMember (String memberName) {

        byte newMembersAmount = 0;

        Parent [] parentResult = new Parent [0];
         parentMember = getParentMember();

        for (int index = 0; index < parentMember.length; index++) {
            if (parentMember[index].getName().equals(memberName)) {
                System.arraycopy(parentMember, index+1, parentMember, index, parentMember.length-index-1);
                parentMember = Arrays.copyOf(parentMember, parentMember.length -1);
            }
        }
        return parentMember;
    }
}
