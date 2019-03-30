package ro.ubb.dezsi.imola.lab2.exercises.composite;
import ro.ubb.dezsi.imola.lab2.exercises.component.*;
import ro.ubb.dezsi.imola.lab2.exercises.pricing.CarPricingComposite;
import ro.ubb.dezsi.imola.lab2.exercises.pricing.PriceableComponent;

import java.util.Arrays;
import java.util.List;

public class CompositeMain {
    public static void main(String[] args) {
        CarPricingComposite car =new CarPricingComposite();
        CarPricingComposite car1 = new CarPricingComposite();
        List<PriceableComponent> componentsCar1 = Arrays.asList(new Engine("electric"), new Chassis("titanium"), new Wheel("Summer"), new Wheel("Summer"), new Wheel("Summer"), new Wheel("Summer"), new Paint("red"));
        for (PriceableComponent c:componentsCar1) {
            car1.addElement(c);
            System.out.println(String.format("Car contains component with type %s and price: "+ c.getPrice(), c.getClass().getSimpleName()));

        }
        System.out.println("Car price: "+ car1.getPrice());

        // adding a car as a component to another car only to test the pattern and see if it works
        // using reflection only for testing purposes too

        List<PriceableComponent> components = Arrays.asList(car1, new Engine("electric"), new Chassis("titanium"), new Wheel("Summer"), new Wheel("Summer"), new Wheel("Summer"), new Wheel("Summer"), new Paint("red"));
        for (PriceableComponent c:components) {
            car.addElement(c);
            System.out.println(String.format("Super car contains component with type %s and price: "+ c.getPrice(), c.getClass().getSimpleName()));

        }
        System.out.println("Super car price: "+ car.getPrice());


    }
}
