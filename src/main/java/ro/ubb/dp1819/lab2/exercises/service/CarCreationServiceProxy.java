package ro.ubb.dp1819.lab2.exercises.service;

import ro.ubb.dp1819.lab2.exercises.Car;
import ro.ubb.dp1819.lab2.exercises.component.Chassis;
import ro.ubb.dp1819.lab2.exercises.component.Engine;
import ro.ubb.dp1819.lab2.exercises.component.Paint;
import ro.ubb.dp1819.lab2.exercises.component.Wheel;
import ro.ubb.dp1819.lab2.exercises.decoration.FlashyLights;
import ro.ubb.dp1819.lab2.exercises.decoration.Spoiler;
import ro.ubb.dp1819.lab2.exercises.pricing.CarPricingComposite;
import ro.ubb.dp1819.lab2.exercises.pricing.CarPricingLeaf;

import java.util.List;

public class CarCreationServiceProxy implements CarService {
    private CarCreationService carCreationService;
    private List<String> parts;

    public CarCreationServiceProxy(List<String> parts){
        this.parts = parts;
    }

    @Override
    public String ShowCar() {
        if (carCreationService == null)
            carCreationService = new CarCreationService();

        carCreationService.createCar(this.parts);
        Car car = this.carCreationService.getCar();

        CarPricingLeaf leaf1 = new CarPricingLeaf(car.getComponents().stream()
                .filter(s -> s.getClass().equals(Engine.class)).findAny().get());
        CarPricingLeaf leaf2 = new CarPricingLeaf(car.getComponents().stream()
                .filter(s -> s.getClass().equals(Chassis.class)).findAny().get());
        CarPricingLeaf leaf3 = new CarPricingLeaf(car.getComponents().stream()
                .filter(s -> s.getClass().equals(Wheel.class)).findAny().get());
        CarPricingLeaf leaf4 = new CarPricingLeaf(car.getComponents().stream()
                .filter(s -> s.getClass().equals(Paint.class)).findAny().get());

        car = new FlashyLights(car);
        car = new Spoiler(car);
        CarPricingLeaf leaf5 = new CarPricingLeaf(new FlashyLights(car));
        CarPricingLeaf leaf6 = new CarPricingLeaf(new Spoiler(car));

        CarPricingComposite comp = new CarPricingComposite();
        comp.addElement(leaf2);
        comp.addElement(leaf3);
        comp.addElement(leaf4);

        CarPricingComposite carComposite = new CarPricingComposite();
        carComposite.addElement(comp);
        carComposite.addElement(leaf1);

        CarPricingComposite decoration = new CarPricingComposite();
        decoration.addElement(leaf5);
        decoration.addElement(leaf6);
        carComposite.addElement(decoration);

        String res = car.show();
        res += carComposite.getPrice();
        return res;
    }

    public CarCreationService getCarCreationService() {
        return carCreationService;
    }
}
