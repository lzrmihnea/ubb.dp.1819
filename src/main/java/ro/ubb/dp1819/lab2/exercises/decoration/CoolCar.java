package ro.ubb.dp1819.lab2.exercises.decoration;

import ro.ubb.dp1819.lab2.exercises.Car;
import ro.ubb.dp1819.lab2.exercises.Driveable;
import ro.ubb.dp1819.lab2.exercises.pricing.PriceableComponent;

public class CoolCar extends Car implements Driveable {

    private Driveable car;

    public CoolCar(Driveable car) {
        this.car = car;
    }

    @Override
    public void addComponent(PriceableComponent component) {
        car.addComponent(component);
    }

    @Override
    public void printCar() {
        car.printCar();
    }

    @Override
    public Long getPrice() {
        return car.getPrice();
    }
}
