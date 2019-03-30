package ro.ubb.dp1819.fulea.razvan.lab2.bridge.race;

import ro.ubb.dp1819.fulea.razvan.lab2.bridge.model.Car;
import ro.ubb.dp1819.fulea.razvan.lab2.bridge.service.CarCreationService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LocalRace extends Race {

    public LocalRace(CarCreationService service){
        super(service);
    }

    @Override
    public void start() {
        List<String> components1 = new ArrayList<>(Arrays.asList("Cheap Engine", "Some Wheels", "Spoiler"));
        List<String> components2 = new ArrayList<>(Arrays.asList("Cheap Engine", "Four Wheels"));
        Car car1 = service.createCar(components1);
        Car car2 = service.createCar(components2);
        System.out.println("Local race between:\n" + car1 + "\n" + car2 + "\n");
    }
}
