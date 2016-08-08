package familyDB;

/**
 * Created by WEO on 7/13/16.
 */
public class FamilyMember {

    private String name;
    private String surName;
    private String dateBirth;
    private String homeAddr;
    private String activity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getHomeAddr() {
        return homeAddr;
    }

    public void setHomeAddr(String homeAddr) {
        this.homeAddr = homeAddr;
    }

    public String getActivity() { return activity;  }

    public void setActivity(String activity) {  this.activity = activity;  }

    @Override
    public String toString() {
        return "" +
                "name='" + name + '\'' +
/*                ", surName='" + surName + '\'' +
                ", dateBirth='" + dateBirth + '\'' +
                ", homeAddr='" + homeAddr + '\'' +
                ", activity='" + activity + '\'' +*/
                '}';
    }
}
