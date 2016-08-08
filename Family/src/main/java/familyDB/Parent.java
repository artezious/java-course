package familyDB;

/**
 * Created by WEO on 7/13/16.
 */
public class Parent extends FamilyMember {

    private Kid kid;
    private String picnicActivity;

    public Kid getKid() {
        return kid;
    }

    public void setKid(Kid kid) {
        this.kid = kid;
    }

    public String getPicnicActivity() { return picnicActivity;  }

    public void setPicnicActivity(String picnicActivity) {  this.picnicActivity = picnicActivity;   }

    @Override
    public String toString() {
        return "Parent{" + super.toString() +
                ", KidName='" + kid.getName() + '\'' +
//                ", picnicActivity='" + picnicActivity + '\'' +
                '}';
    }

}

