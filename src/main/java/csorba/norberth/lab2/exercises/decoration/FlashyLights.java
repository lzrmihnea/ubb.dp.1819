package csorba.norberth.lab2.exercises.decoration;

import csorba.norberth.lab2.exercises.CarPriceable;
import csorba.norberth.lab2.exercises.Driveable;

public class FlashyLights extends CarDecoration {
    public FlashyLights(CarPriceable car) {
        super(car);
    }

    @Override
    public Long getPrice() {
        return super.priceable.getPrice() + 100;
    }
}
