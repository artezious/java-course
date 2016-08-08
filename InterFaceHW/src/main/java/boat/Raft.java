package boat;

/**
 * Created by WEO on 7/21/16.
 */
public class Raft extends Boat {


    String boatName;
    String boatSpeed;
    String boatCruisingRange;

    public Raft (String boatName, String boatSpeed, String boatCruisingRange) {

        this.boatName = boatName;
        this.boatSpeed = boatSpeed;
        this.boatCruisingRange = boatCruisingRange;
    }

    public String getBoatName() {
        return boatName;
    }

    public void setBoatName(String boatName) {
        this.boatName = boatName;
    }

    public String getBoatSpeed() {
        return boatSpeed;
    }

    public void setBoatSpeed(String boatSpeed) {
        this.boatSpeed = boatSpeed;
    }

    public String getBoatCruisingRange() {
        return boatCruisingRange;
    }

    public void setBoatCruisingRange(String boatCruisingRange) {
        this.boatCruisingRange = boatCruisingRange;
    }

}
