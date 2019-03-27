package ro.ubb.dp1819.lab2.exercises.service;

import org.springframework.stereotype.Service;
import ro.ubb.dp1819.lab2.exercises.Car;
import ro.ubb.dp1819.lab2.exercises.component.*;
import ro.ubb.dp1819.todoran.corina.lab2.adapter.ICarPartInterpreter;
import ro.ubb.dp1819.todoran.corina.lab2.model.CarPart;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
public class CarCreationService implements ICarCreationService {
    private ICarPartInterpreter carPartInterpreter;

    public CarCreationService(ICarPartInterpreter carInputComponent) {
        this.carPartInterpreter = carInputComponent;
    }

    public Car createCar(List<String> carInputComponents) {
        List<CarPart> carParts = carPartInterpreter.interpretCarParts(carInputComponents);
        List<CarComponent> components = new ArrayList<>();
        carParts.forEach(carPart -> components.addAll(toCarComponents(carPart)));
        return new Car(components);
    }

    private List<CarComponent> toCarComponents(CarPart carPart) {
        switch (carPart.getComponent()) {
            case "wheels":
                return createCarComponent(carPart.getQuantity(), () -> new Wheel(carPart.getType()));
            case "chassis":
                return createCarComponent(carPart.getQuantity(), () -> new Chassis(carPart.getType()));
            case "engine":
                return createCarComponent(carPart.getQuantity(), () -> new Engine(carPart.getType()));
            case "paint":
                return createCarComponent(carPart.getQuantity(), () -> new Paint(carPart.getType()));
        }
        return Collections.emptyList();
    }

    private List<CarComponent> createCarComponent(int quantity, Supplier<CarComponent> supplier) {
        List<CarComponent> components = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            components.add(supplier.get());
        }
        return components;
    }
}
