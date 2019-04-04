package ro.ubb.dp1819.lab2.exercises.pricing;

import java.util.ArrayList;
import java.util.List;

public class CarPricingComposite implements PriceableComponent {

    private List<PriceableComponent> elements = new ArrayList<>();

    public void addElement(PriceableComponent el) {
        this.elements.add(el);
    }

    @Override
    public Long getPrice() {
//        TODO
        return null;
    }
}
