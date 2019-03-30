package ro.ubb.dp1819.fulea.razvan.lab2.decorator.car;

import ro.ubb.dp1819.fulea.razvan.lab2.decorator.CarPriceable;

public class Engine implements CarPriceable {
    private String name;
    private Integer power;
    private Long price;

    public Engine(String name, Integer power, Long price){
        this.name = name;
        this.power = power;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Integer getPower() {
        return power;
    }

    @Override
    public Long getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", price=" + price +
                '}';
    }
}
