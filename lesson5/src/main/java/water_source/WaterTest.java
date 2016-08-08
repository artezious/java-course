package water_source;

public class WaterTest {
    public static void main(String[] args) {
//        WaterSource waterSource = new WaterSource();
//        System.out.println(waterSource);

        WaterPool waterPool = new WaterPool();
        System.out.println(waterPool);

        WaterSource child = new WaterPool();
        child.printMessage();


        WaterSource []waterSources = {new WaterPool(),
        new WaterPool2(), new WaterPool1()};

        for(WaterSource wc : waterSources) {
            wc.printMessage();
        }



    }
}
