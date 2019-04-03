package Decorator.decorationClasses;

import Proxy.CarPriceable;

public class Nos extends CarDecoration {

    public Nos(CarPriceable carPriceable) {
        super(carPriceable);
    }

    @Override
    public Long getPrice() {
        return super.getPrice() + 100L;
    }

    @Override
    public String toString() {
        return super.toString() + " decorated with Nos";
    }
}
