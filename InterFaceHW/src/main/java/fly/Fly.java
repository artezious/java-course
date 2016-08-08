package fly;

/**
 * Created by WEO on 7/21/16.
 */
public interface Fly {

    String FONAME = "APACHE";
    String FOSPEED = "365 km/h";
    String FOWEIGHT = "5MT";
    String FOPASSCOUNT = "10";
    String FOLEVELSAFETY = "HIGH";

    void getFlyObjectName();

    void getFlyObjectSpeed();

    void getFlyObjectWeight();

    void getPassengersCount();

    void getLevelSafety();

}
