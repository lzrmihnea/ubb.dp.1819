package ro.ubb.dezsi.imola.lab2.exercises.decoration;

import ro.ubb.dezsi.imola.lab2.exercises.Car;
import ro.ubb.dezsi.imola.lab2.exercises.Driveable;

public class FlashyLights extends CoolCar implements CarDecoration {
    public FlashyLights(Driveable c) {
        super(c);
    }

    @Override
    public Long getPrice() {
        return super.getPrice() +  600L;
    }
}
