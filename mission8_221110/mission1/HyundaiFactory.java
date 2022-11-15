package mission8_221110.mission1;

public class HyundaiFactory {
    private static HyundaiFactory factory = new HyundaiFactory();

    private HyundaiFactory() {
    }

    public static HyundaiFactory getInstance() {
        return factory;
//        return new HyundaiFactory();
    }

    public Car createCar(){
        return new Car();
    }
}
