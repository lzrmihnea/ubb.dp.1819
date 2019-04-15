package lab2.Decorator;

import lab2.Proxy.CarPriceable;

import java.util.ArrayList;
import java.util.List;

public class CarPricingCompositeDec implements CarPriceable {

    private List<CarPriceable> elements = new ArrayList<>();

    public void addElement(CarPriceable el) {
        this.elements.add(el);
    }

    @Override
    public Long getPrice() {
        Long totalPrice = 0L;
        for(CarPriceable carPriceable: elements) {
            totalPrice+=carPriceable.getPrice();
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return "CarPricingCompositeDec{" +
                "elements=" + elements +
                '}';
    }
}
