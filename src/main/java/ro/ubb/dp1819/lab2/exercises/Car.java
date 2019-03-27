package ro.ubb.dp1819.lab2.exercises;

import ro.ubb.dp1819.lab2.exercises.component.CarComponent;
import ro.ubb.dp1819.lab2.exercises.pricing.CarPricingComposite;

import java.util.List;

public class Car extends CarPricingComposite implements Driveable, CarPriceable {
    private List<CarComponent> components;


    public Car(List<CarComponent> components) {
        this.components = components;
        components.forEach(super::addElement);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        components.forEach(component -> stringBuilder.append(component).append("\n"));
        return "Car { " +
                "\n" +
                stringBuilder +
                " }";
    }
}
