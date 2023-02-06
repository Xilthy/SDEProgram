package creational;

public class Client {
    public static void main(String[] args) {
        BusBuilder builder = new BusBuilder();
        Car bus = Director.builder(builder);
        System.out.println(bus.getCar_name());
        ThreeRoundsBuilder builder1 = new ThreeRoundsBuilder();
        Car threeRoundsCar = Director.builder(builder1);
        System.out.println(threeRoundsCar.getCar_name());
    }
}
