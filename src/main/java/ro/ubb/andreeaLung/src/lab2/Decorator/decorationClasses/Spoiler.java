package lab2.Decorator.decorationClasses;

import lab2.Proxy.CarPriceable;

public class Spoiler extends CarDecoration {

    public Spoiler(CarPriceable carPriceable) {
        super(carPriceable);
    }

    @Override
    public Long getPrice() {
        return super.getPrice() + 13L;
    }

    @Override
    public String toString() {
        return super.toString() + " decorated with Spoiler";
    }
}