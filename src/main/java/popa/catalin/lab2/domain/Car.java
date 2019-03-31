package popa.catalin.lab2.domain;

import popa.catalin.lab2.domain.component.AbstractCarComponent;
import popa.catalin.lab2.domain.component.CarComponent;
import popa.catalin.lab2.pricing.CarPricingComposite;

import java.util.ArrayList;
import java.util.List;

public class Car extends CarPricingComposite<AbstractCarComponent> implements Driveable {

    public List<AbstractCarComponent> getCarComponentList() {
        return elements;
    }

    public Car(List<AbstractCarComponent> carComponentList) {
        this.elements = carComponentList;
    }

    @Override
    public void Drive() {
        System.out.println("VROOM VROOM !!");
    }
}
