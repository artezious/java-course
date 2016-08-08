package Boss;

/**
 * Created by WEO on 7/10/16.
 */
public class Employee extends UserDB {

    private Boss yourBoss;

    public Boss getYourBoss() {
        return yourBoss;
    }

    public void setYourBoss(Boss yourBoss) {
        this.yourBoss = yourBoss;
    }
}

