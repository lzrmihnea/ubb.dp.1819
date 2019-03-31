package popa.catalin.lab2.pricing;

import popa.catalin.lab2.domain.CarPriceable;

import java.util.ArrayList;
import java.util.List;

public class CarPricingComposite<T extends CarPriceable> implements CarPriceable {

    protected List<T> elements = new ArrayList<>();

    public void addElement(T el) {
        this.elements.add(el);
    }

    @Override
    public Long getPrice() {
        Long sum = 0L;
        for (T element : elements)
            sum += element.getPrice();
        return sum;
    }
}
