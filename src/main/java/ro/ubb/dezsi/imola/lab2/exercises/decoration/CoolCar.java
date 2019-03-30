package ro.ubb.dezsi.imola.lab2.exercises.decoration;

import ro.ubb.dezsi.imola.lab2.exercises.Car;
import ro.ubb.dezsi.imola.lab2.exercises.Driveable;

public class CoolCar implements Driveable  {

     private Driveable car;


    public CoolCar(Driveable c) {
        this.car = c;
    }

    public Long getPrice() { // Implementing methods of the interface
        return car.getPrice();
    }


}
