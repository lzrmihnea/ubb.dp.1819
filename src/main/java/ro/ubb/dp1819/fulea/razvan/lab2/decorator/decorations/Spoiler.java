package ro.ubb.dp1819.fulea.razvan.lab2.decorator.decorations;

import ro.ubb.dp1819.fulea.razvan.lab2.decorator.CarPriceable;

public class Spoiler extends CarDecoration {

    public Spoiler(CarPriceable carPriceable) {
        super(carPriceable);
    }

    @Override
    public Long getPrice() {
        return super.getPrice() + 50L;
    }

    @Override
    public String toString() {
        return super.toString() + " with Spoiler";
    }
}
