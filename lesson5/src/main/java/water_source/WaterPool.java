package water_source;


public class WaterPool extends WaterSource {
    public WaterPool() {
        super("default_value");
        System.out.println("Water pool constructor");
    }



// нельзя переопределить т.к в родителе проставлен модификатор доступа для данного метода - final
  @Override
    public void printMessage() {
      System.out.println("pool1");
    }
}
