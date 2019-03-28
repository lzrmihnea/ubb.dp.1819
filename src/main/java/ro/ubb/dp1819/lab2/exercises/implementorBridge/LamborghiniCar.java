package ro.ubb.dp1819.lab2.exercises.implementorBridge;

import ro.ubb.dp1819.lab2.exercises.component.CarComponent;

import java.util.List;

public class LamborghiniCar implements Manufacturer{

    @Override
    public void showCar(List<CarComponent> components) {
        System.out.println("Lamborghini car:");
        components.forEach(s -> System.out.println(s.getComponent()));
    }
}
