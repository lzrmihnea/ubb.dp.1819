package ro.ubb.dp1819.lab2.exercises.service;

import org.springframework.stereotype.Service;
import ro.ubb.dp1819.lab2.exercises.Car;
import ro.ubb.dp1819.lab2.exercises.component.*;
import ro.ubb.dp1819.lab2.exercises.implementorBridge.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class CarCreationService implements CarService{

    private final List<String> CHASSISTYPE = Arrays.asList("titanium", "aluminium", "vibranium", "adamantium");
    private final List<String> ENGINETYPE = Arrays.asList("electric", "diesel", "gpl");
    private final List<String> PAINT = Arrays.asList("red", "white", "black", "blue", "pink", "green", "yellow");
    private Car car;

    public void createCar(List<String> carInputComponents) {
        if (carInputComponents.size() < 4)
            return;

        List<CarComponent> components = getComponents(carInputComponents);

        if (components.stream().anyMatch(s -> s.getComponent().contains("aluminium")))
            car = new NormalCar(components, new HondaCar());
        if (components.stream().anyMatch(s -> s.getComponent().contains("vibranium")))
            car = new SportsCar(components, new FerrariCar());
        if (components.stream().anyMatch(s -> s.getComponent().contains("titanium")))
            car = new SportsCar(components, new PorscheCar());
        if (components.stream().anyMatch(s -> s.getComponent().contains("adamantium")))
            car = new SportsCar(components, new LamborghiniCar());
    }

    private List<CarComponent> getComponents(List<String> carInputComponents){
        return carInputComponents.stream().map(s -> {
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
    }

    @Override
    public String ShowCar() {return this.car.show(); }
    public Car getCar() { return car; }
}
