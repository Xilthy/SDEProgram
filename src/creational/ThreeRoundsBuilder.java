package creational;

public class ThreeRoundsBuilder implements Builder{
    private Car car = new Car();
    @Override
    public void createName() {
        car.setCar_name("Three Rounds Car");
    }

    @Override
    public Car getCar() {
        return car;
    }
}
