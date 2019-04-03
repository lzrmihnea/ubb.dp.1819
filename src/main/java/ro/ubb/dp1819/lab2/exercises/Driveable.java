package ro.ubb.dp1819.lab2.exercises;

import ro.ubb.dp1819.lab2.exercises.pricing.PriceableComponent;

public interface Driveable extends PriceableComponent {

    void printCar();
    void addComponent(PriceableComponent component);

}
