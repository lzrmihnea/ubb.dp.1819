package lab2.Composite;

import java.util.ArrayList;
import java.util.List;

public class CarPricingComposite implements PriceableComponent {

    private List<PriceableComponent> elements = new ArrayList<>();

    public void addElement(PriceableComponent el) {
        this.elements.add(el);
    }

    @Override
    public Long getPrice() {
        Long totalPrice = 0L;
        for(PriceableComponent priceableComponent: elements) {
            totalPrice+=priceableComponent.getPrice();
        }
        return totalPrice;
    }
}
