package creational;

public class Car {
    private String car_name;

    public String getCar_name() {
        return car_name;
    }

    public void setCar_name(String car_name) {
        this.car_name = car_name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "car_name='" + car_name + '\'' +
                '}';
    }
}
