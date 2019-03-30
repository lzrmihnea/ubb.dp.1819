package ro.ubb.dezsi.imola.lab2.exercises.bridge;

import ro.ubb.dezsi.imola.lab2.exercises.Car;
import ro.ubb.dezsi.imola.lab2.exercises.Driveable;
import ro.ubb.dezsi.imola.lab2.exercises.component.*;
import ro.ubb.dezsi.imola.lab2.exercises.pricing.PriceableComponent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class BridgeMain {
    public static void main(final String[] args) {
        Car car =new Car();
        List<CarComponent> components = Arrays.asList(new Engine("electric"), new Chassis("titanium"), new Wheel("Summer"), new Wheel("Summer"), new Wheel("Summer"), new Wheel("Summer"), new Paint("red"));
        for (CarComponent c:components)
            car.addElement((PriceableComponent) c);
        System.out.println(car);

    }
}