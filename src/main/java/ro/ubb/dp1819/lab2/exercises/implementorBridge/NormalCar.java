package ro.ubb.dp1819.lab2.exercises.implementorBridge;

import ro.ubb.dp1819.lab2.exercises.Car;
import ro.ubb.dp1819.lab2.exercises.component.CarComponent;

import java.util.List;

public class NormalCar extends Car {
    private List<CarComponent> components;

    public NormalCar(List<CarComponent> components, Manufacturer manufacturer) {
        super(manufacturer);
        this.components = components;
    }

    @Override
    public String show() {
        return this.manufacturer.showCar(this.components);
    }

    @Override
    public List<CarComponent> getComponents() {
        return components;
    }
}
