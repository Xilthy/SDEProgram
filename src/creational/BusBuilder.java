package creational;

public class BusBuilder implements Builder{
    private Car car = new Car();
    @Override
    public void createName() {
        car.setCar_name("Bus");
    }

    @Override
    public Car getCar() {
        return car;
    }
}
