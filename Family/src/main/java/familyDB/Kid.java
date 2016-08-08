package familyDB;

/**
 * Created by WEO on 7/13/16.
 */
public class Kid extends FamilyMember {

    private Kid grandKid;

    public Kid getGrandKid() {
        return grandKid;
    }

    public void setGrandKid(Kid grandKid) {
        this.grandKid = grandKid;
    }

    @Override
    public String toString() {
        return "Kid{" +
                "grandKid of =" + grandKid +
                '}';
    }
}
