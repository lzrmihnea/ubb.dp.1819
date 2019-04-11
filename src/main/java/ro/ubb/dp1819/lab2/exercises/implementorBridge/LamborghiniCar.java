package ro.ubb.dp1819.lab2.exercises.implementorBridge;

import ro.ubb.dp1819.lab2.exercises.component.CarComponent;

import java.util.List;

public class LamborghiniCar implements Manufacturer{

    @Override
    public String showCar(List<CarComponent> components) {
        StringBuilder stringBuilder = new StringBuilder().append("Lamborghini:").append("\n");
        components.forEach(s -> stringBuilder.append(s.getComponent()).append("\n"));
        return stringBuilder.toString();
    }
}
