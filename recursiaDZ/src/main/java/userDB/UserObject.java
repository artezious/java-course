package userDB;

/**
 * Created by WEO on 8/22/16.
 */
public class UserObject {

    private String name;
    private String Boss;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBoss() {
        return Boss;
    }

    public void setBoss(String boss) {
        Boss = boss;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserObject)) return false;

        UserObject that = (UserObject) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return Boss != null ? Boss.equals(that.Boss) : that.Boss == null;

    }

    @Override
    public String toString() {
        return "UserObject{" +
                "name='" + name + '\'' +
                ", Boss='" + Boss + '\'' +
                '}';
    }
}
