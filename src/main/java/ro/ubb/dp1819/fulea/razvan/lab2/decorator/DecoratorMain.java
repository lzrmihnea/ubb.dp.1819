package ro.ubb.dp1819.fulea.razvan.lab2.decorator;

import ro.ubb.dp1819.fulea.razvan.lab2.decorator.car.Car;
import ro.ubb.dp1819.fulea.razvan.lab2.decorator.car.Engine;
import ro.ubb.dp1819.fulea.razvan.lab2.decorator.decorations.Neons;
import ro.ubb.dp1819.fulea.razvan.lab2.decorator.decorations.RaceExhausts;
import ro.ubb.dp1819.fulea.razvan.lab2.decorator.decorations.Spoiler;

public class DecoratorMain {

    public static void run() {
        CarPricingComposite composite = new CarPricingComposite();

        CarPriceable engine = new Engine("V8", 725, 1500L);
        CarPriceable engineWithNeons = new Neons(engine);

        Car car = new Car("Dacia", 4000L);
        CarPriceable carWithNeons = new Neons(car);
        CarPriceable carWithNeonsAndSpoiler = new Spoiler(carWithNeons);
        CarPriceable carWithNeonsAndSpoilerAndRaceExhausts = new RaceExhausts(carWithNeonsAndSpoiler);

        composite.add(engineWithNeons);
        composite.add(carWithNeonsAndSpoilerAndRaceExhausts);

        System.out.println(composite);
    }

}
