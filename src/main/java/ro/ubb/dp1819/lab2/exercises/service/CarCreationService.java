package ro.ubb.dp1819.lab2.exercises.service;

import org.springframework.stereotype.Service;
import ro.ubb.dp1819.lab2.exercises.Car;
import ro.ubb.dp1819.lab2.exercises.component.*;
import ro.ubb.dp1819.lab2.exercises.implementorBridge.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class CarCreationService {

    private List<String> CHASSISTYPE = Arrays.asList("titanium", "aluminium", "vibranium", "adamantium");
    private List<String> ENGINETYPE = Arrays.asList("electric", "diesel", "gpl");
    private List<String> PAINT = Arrays.asList("red", "white", "black", "blue", "pink", "green", "yellow");

    public Car createCar(List<String> carInputComponents) {
        if (carInputComponents.size() < 4)
            return null;

        List<CarComponent> components = carInputComponents.stream().map(s -> {
            if (s.contains("summer") || s.contains("winter"))
                return new Wheel(s.split(" ")[1],Integer.parseInt(s.split(" ")[0]));
            if (CHASSISTYPE.contains(s))
                return new Chassis(s);
            if (ENGINETYPE.contains(s))
                return new Engine(s);
            if (PAINT.contains(s))
                return new Paint(s);
            return null;
        }).collect(Collectors.toList());

        if (components.stream().anyMatch(s -> s.getComponent().contains("aluminium")))
            return new NormalCar(components, new HondaCar());
        if (components.stream().anyMatch(s -> s.getComponent().contains("vibranium")))
            return new SportsCar(components, new FerrariCar());
        if (components.stream().anyMatch(s -> s.getComponent().contains("titanium")))
            return new SportsCar(components, new PorscheCar());
        if (components.stream().anyMatch(s -> s.getComponent().contains("adamantium")))
            return new SportsCar(components, new LamborghiniCar());

        return null;
    }
}
