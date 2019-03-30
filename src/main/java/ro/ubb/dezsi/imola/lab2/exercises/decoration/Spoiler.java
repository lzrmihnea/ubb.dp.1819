package ro.ubb.dezsi.imola.lab2.exercises.decoration;

import ro.ubb.dezsi.imola.lab2.exercises.Car;
import ro.ubb.dezsi.imola.lab2.exercises.Driveable;

public class Spoiler extends CoolCar implements CarDecoration {
    public Spoiler(Driveable c) {
        super(c);
    }

    @Override
    public Long getPrice() {
        return super.getPrice() +  700L;
    }
}
