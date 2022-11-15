package mission8_221110.mission1;

public class CarTest {

    public static void main(String[] args) {
        HyundaiFactory factory = HyundaiFactory.getInstance();

        Car myCar = factory.createCar();
        Car yourCar = factory.createCar();
        System.out.println("첫번째 차 번호는" +myCar.showCarNumber());
        System.out.println("두번째 차 번호는" +yourCar.showCarNumber());

        HyundaiFactory factory1 = HyundaiFactory.getInstance();
        System.out.println(factory);
        System.out.println(factory1);
    }
}
