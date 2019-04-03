package ro.ubb.dp1819.lab2.exercises.service;

import ro.ubb.dp1819.lab2.exercises.Car;
import ro.ubb.dp1819.lab2.exercises.CarPriceable;
import ro.ubb.dp1819.lab2.exercises.Driveable;
import ro.ubb.dp1819.lab2.exercises.ICreation;
import ro.ubb.dp1819.lab2.exercises.component.*;
import ro.ubb.dp1819.lab2.exercises.decoration.*;
import ro.ubb.dp1819.lab2.exercises.pricing.PriceableComponent;
import ro.ubb.dp1819.lab2.home.CarPart;

import java.util.List;


public class CarCreationService implements ICreation{
    private List<CarPart> carParts;

    public CarCreationService(List<CarPart> carParts) {
        this.carParts = carParts;
    }

    public Driveable createCar() {
        Car car = new Car();

        for (CarPart part: carParts){
            if(part.getName().equals("chassis")){
                CarComponent component = new Chassis();
                car.addComponent(component);
            }
            if (part.getName().equals("wheel")){
                CarComponent component = new Wheel();
                car.addComponent(component);
            }
            if (part.getName().equals("paint")){
                CarComponent component = new Paint();
                car.addComponent(component);
            }
            if (part.getName().equals("engine")){
                CarComponent component = new Engine();
                car.addComponent(component);
            }
        }
        return car;
    }

    @Override
    public Driveable createCoolCar() {
        CoolCar car = new CoolCar(createCar());

        for (CarPart part: carParts){
            if(part.getName().equals("nos")){
                PriceableComponent component = new Nos();
                car.addComponent(component);
            }
            if(part.getName().equals("spoiler")){
                PriceableComponent component = new Spoiler();
                car.addComponent(component);
            }
            if(part.getName().equals("flashyLights")){
                PriceableComponent component = new FlashyLights();
                car.addComponent(component);
            }
        }
        return car;
    }
}
