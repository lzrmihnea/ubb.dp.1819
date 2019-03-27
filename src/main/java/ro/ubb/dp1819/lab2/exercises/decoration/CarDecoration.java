package ro.ubb.dp1819.lab2.exercises.decoration;

import ro.ubb.dp1819.lab2.exercises.CarPriceable;

public abstract class CarDecoration implements CarPriceable {
    protected CarPriceable priceable;

    protected CarDecoration(CarPriceable priceable) {
        this.priceable = priceable;
    }
}
