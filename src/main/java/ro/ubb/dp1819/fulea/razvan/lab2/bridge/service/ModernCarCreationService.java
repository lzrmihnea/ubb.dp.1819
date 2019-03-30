package ro.ubb.dp1819.fulea.razvan.lab2.bridge.service;

import ro.ubb.dp1819.fulea.razvan.lab2.bridge.model.Car;
import ro.ubb.dp1819.fulea.razvan.lab2.bridge.model.RaceCar;
import ro.ubb.dp1819.fulea.razvan.lab2.bridge.model.SlowCar;

import java.util.List;

public class ModernCarCreationService extends CarCreationService {

    @Override
    public Car createCar(List<String> carInputComponents) {
        Car car;

        if (carInputComponents.contains("Spoiler"))
            car = new RaceCar("BMW 7 Series", carInputComponents);
        else
            car = new SlowCar("Trabant 2018", carInputComponents);

        return car;
    }
}
