package boat;

/**
 * Created by WEO on 7/21/16.
 */
public class Ship extends Boat {

    String boatName;
    String boatSpeed;
    String boatCruisingRange;

    public Ship (String boatName, String boatSpeed, String boatCruisingRange) {

        this.boatName = boatName;
        this.boatSpeed = boatSpeed;
        this.boatCruisingRange = boatCruisingRange;
    }

    @Override
    public String getBoatName() {
        return boatName;
    }

    public void setBoatName(String boatName) {
        this.boatName = boatName;
    }

    @Override
    public String getBoatSpeed() {
        return boatSpeed;
    }

    public void setBoatSpeed(String boatSpeed) {
        this.boatSpeed = boatSpeed;
    }

    @Override
    public String getBoatCruisingRange() {
        return boatCruisingRange;
    }

    public void setBoatCruisingRange(String boatCruisingRange) {
        this.boatCruisingRange = boatCruisingRange;
    }
}

