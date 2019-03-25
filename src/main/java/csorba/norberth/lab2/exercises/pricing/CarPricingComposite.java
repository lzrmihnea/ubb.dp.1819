package csorba.norberth.lab2.exercises.pricing;

import csorba.norberth.lab2.exercises.CarPriceable;

import java.util.ArrayList;
import java.util.List;

public class CarPricingComposite implements PriceableComponent {

    protected List<PriceableComponent> elements = new ArrayList<>();

    public void addElement(PriceableComponent el) {
        this.elements.add(el);
    }

    @Override
    public Long getPrice() {
        return elements.stream()
                .map(PriceableComponent::getPrice)
                .reduce((long)0, (a,b)->a+b);
    }
}
