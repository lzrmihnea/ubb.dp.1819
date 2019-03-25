package csorba.norberth.lab2.exercises.service;

import csorba.norberth.lab2.adapter.CarPartInterpreter;
import csorba.norberth.lab2.adapter.ICarPartInterpreter;
import csorba.norberth.lab2.exercises.Car;
import csorba.norberth.lab2.exercises.component.*;
import csorba.norberth.lab2.models.CarPart;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

@Service
public class CarCreationService implements ICarCreationService {
    private ICarPartInterpreter carPartInterpreter;

    public CarCreationService(ICarPartInterpreter interpreter){
        this.carPartInterpreter = interpreter;
    }

    public Car createCar(List<String> carInputComponents) {
        List<CarPart> carParts = carPartInterpreter.interpretCarParts(carInputComponents);
        List<CarComponent> components = new ArrayList<>();
        for(CarPart part : carParts){
            components.addAll(toCarComponents(part));
        }
        return new Car(components);
    }

    private List<CarComponent> toCarComponents(CarPart carPart) {
        switch (carPart.getComponent()) {
            case "wheels":
                return createCarComponents(carPart.getQuantity(), () -> new Wheel(carPart.getType()));
            case "chassis":
                return createCarComponents(carPart.getQuantity(), () -> new Chassis(carPart.getType()));
            case "engine":
                return createCarComponents(carPart.getQuantity(), () -> new Engine(carPart.getType()));
            case "paint":
                return createCarComponents(carPart.getQuantity(), () -> new Paint(carPart.getType()));
        }
        return Collections.emptyList();
    }

    private List<CarComponent> createCarComponents(int quantity, Supplier<CarComponent> supplier) {
        List<CarComponent> components = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            components.add(supplier.get());
        }
        return components;
    }
}
