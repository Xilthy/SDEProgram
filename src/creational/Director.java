package creational;

public class Director {
    public static Car builder(Builder builder){
        builder.createName();
        return builder.getCar();
    }
}
