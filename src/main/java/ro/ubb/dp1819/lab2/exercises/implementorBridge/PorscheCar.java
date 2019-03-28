package ro.ubb.dp1819.lab2.exercises.implementorBridge;

import ro.ubb.dp1819.lab2.exercises.component.CarComponent;

import java.util.List;

public class PorscheCar implements Manufacturer {

    @Override
    public void showCar(List<CarComponent> components) {
        System.out.println("Porsche car:");
        components.forEach(s -> System.out.println(s.getComponent()));
    }
}
