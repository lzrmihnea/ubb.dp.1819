package ro.ubb.dp1819.fulea.razvan.lab2.bridge.service;

import ro.ubb.dp1819.fulea.razvan.lab2.bridge.model.Car;
import ro.ubb.dp1819.fulea.razvan.lab2.bridge.model.RaceCar;
import ro.ubb.dp1819.fulea.razvan.lab2.bridge.model.SlowCar;

import java.util.List;

public class AntiqueCarCreationService extends CarCreationService {

    @Override
    public Car createCar(List<String> carInputComponents) {
        Car car;

        if (carInputComponents.contains("Spoiler"))
            car = new RaceCar("Rolls Royce phantom", carInputComponents);
        else
            car = new SlowCar("Porsche 911", carInputComponents);

        return car;
    }

}
