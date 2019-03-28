package ro.ubb.dp1819.lab2.exercises.implementorBridge;

import ro.ubb.dp1819.lab2.exercises.component.CarComponent;

import java.util.List;

public interface Manufacturer {
    void showCar(List<CarComponent> components);
}

