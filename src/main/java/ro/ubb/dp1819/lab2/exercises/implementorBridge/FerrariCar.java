package ro.ubb.dp1819.lab2.exercises.implementorBridge;

import ro.ubb.dp1819.lab2.exercises.component.CarComponent;

import java.util.List;

public class FerrariCar implements Manufacturer{

    @Override
    public String showCar(List<CarComponent> components) {
        StringBuilder stringBuilder = new StringBuilder().append("Ferrari:").append("\n");
        components.forEach(s -> stringBuilder.append(s.getComponent()).append("\n"));
        return stringBuilder.toString();
    }
}
