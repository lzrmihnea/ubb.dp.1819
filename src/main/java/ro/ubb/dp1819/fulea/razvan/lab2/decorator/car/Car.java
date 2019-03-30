package ro.ubb.dp1819.fulea.razvan.lab2.decorator.car;

import ro.ubb.dp1819.fulea.razvan.lab2.decorator.CarPriceable;

public class Car implements CarPriceable {
    private String name;
    private Long price;

    public Car(String name, Long price){
        this.name = name;
        this.price = price;
    }

    @Override
    public Long getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car: " + name;
    }
}
