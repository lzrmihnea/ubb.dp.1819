package csorba.norberth.lab2.exercises;

import csorba.norberth.lab2.exercises.component.CarComponent;
import csorba.norberth.lab2.exercises.pricing.CarPricingComposite;

import java.util.Collection;
import java.util.List;

public class Car extends CarPricingComposite implements Driveable, CarPriceable {
    private List<CarComponent> components;

    public Car(List<CarComponent> components) {
        this.components = components;
        components.forEach(comp->super.elements.add(comp));
    }

    public Collection<CarComponent> getComponents() {
        return components;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i < components.size(); i++){
            stringBuilder.append(components.get(i));
            if(i < components.size()-1){
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }
}
