package water_source;


public class WaterSource extends Object {
    private String resource;

//    public WaterSource() {
//        System.out.println("waterSource : constructor");
//        resource = "default_value";
//    }

    public WaterSource(String resource) {
        this.resource = resource;
    }

    //@Override
//    public String toString() {
//        return "WaterSource{" +
//                "resource='" + resource + '\'' +
//                '}';
//    }

    public void printMessage() {
        System.out.println(resource);
    }


}


