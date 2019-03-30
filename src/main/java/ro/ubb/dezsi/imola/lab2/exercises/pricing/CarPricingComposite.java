package ro.ubb.dezsi.imola.lab2.exercises.pricing;

import ro.ubb.dezsi.imola.lab2.exercises.CarPriceable;

import java.util.ArrayList;
import java.util.List;

public class CarPricingComposite implements PriceableComponent {

    private List<PriceableComponent> elements = new ArrayList<>();

    public List<PriceableComponent> getElements(){return elements; }
    public void addElement(PriceableComponent el) {
        this.elements.add(el);
    }

    @Override
    public Long getPrice() {
        long s  = 1000;
        //base price
        for (PriceableComponent pc : elements)
            s+=pc.getPrice();
        return s;
    }
}
