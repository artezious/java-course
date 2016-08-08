package water_source;

/**
 * Created by WEO on 7/8/16.
 */
public class WaterSource extends Object {
    private String resource;

//    public WaterSource() {
//        System.out.println("waterSource : constructor");
//        resource = "default_value";
//    }


    public WaterSource (String resource) {
        this.resource = resource;
    }

    @Override
    public String toString() {
        return "WaterSource{" +
                "resource'" + resource + '\'' +
                        '}';
    }



    public String toString(String resource) {
        return this.resource;
    }

}
