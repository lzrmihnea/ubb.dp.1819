package ro.ubb.dezsi.imola.lab2.exercises.decoration;

import ro.ubb.dezsi.imola.lab2.exercises.Car;
import ro.ubb.dezsi.imola.lab2.exercises.Driveable;

public class Nos extends CoolCar implements  CarDecoration {
    public Nos(Driveable c) {
        super(c);
    }

    @Override
    public Long getPrice() {
        return super.getPrice() +  500L;
    }
}
