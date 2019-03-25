package csorba.norberth.lab2.exercises.decoration;

import csorba.norberth.lab2.exercises.CarPriceable;
import csorba.norberth.lab2.exercises.Driveable;

public abstract class CarDecoration implements CarPriceable {

    protected CarPriceable priceable;

    protected CarDecoration(CarPriceable priceable){
        this.priceable = priceable;
    }

}
