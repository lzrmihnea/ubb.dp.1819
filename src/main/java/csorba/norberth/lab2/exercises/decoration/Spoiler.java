package csorba.norberth.lab2.exercises.decoration;

import csorba.norberth.lab2.exercises.CarPriceable;
import csorba.norberth.lab2.exercises.Driveable;

public class Spoiler extends CarDecoration{
    public Spoiler(CarPriceable car) {
        super(car);
    }

    @Override
    public Long getPrice() {
        return super.priceable.getPrice() + 200;
    }
}
