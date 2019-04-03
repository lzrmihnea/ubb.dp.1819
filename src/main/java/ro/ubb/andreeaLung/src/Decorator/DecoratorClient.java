package Decorator;

import Decorator.carComponents.Chassis;
import Decorator.carComponents.Engine;
import Decorator.carComponents.Paint;
import Decorator.carComponents.Wheel;
import Decorator.decorationClasses.FlashyLights;
import Decorator.decorationClasses.Nos;
import Decorator.decorationClasses.Spoiler;
import Proxy.CarPriceable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DecoratorClient {
    public static void main(String[] args) {
        CarPricingCompositeDec composite = new CarPricingCompositeDec();

        CarPriceable chassis = new Chassis("aluminium");
        CarPriceable chassisWithFlashyLights = new FlashyLights(chassis);
        Engine engine = new Engine("disel");
        Paint paint = new Paint("red");
        List<Wheel> wheels = new ArrayList<>();
        Wheel wheel = new Wheel("summer");
        wheels.add(wheel);

        Car car = new Car(wheels, (Chassis) chassis, engine, paint);
        CarPriceable carWithFlashyLights = new FlashyLights(car);
        CarPriceable carWitFlashyLightsAndSpoiler = new Spoiler(carWithFlashyLights);
        CarPriceable carWitFlashyLightsAndSpoilerandNos = new Nos(carWitFlashyLightsAndSpoiler);

        composite.addElement(chassisWithFlashyLights);
        composite.addElement(carWitFlashyLightsAndSpoilerandNos);

        System.out.println(composite);
    }
}
