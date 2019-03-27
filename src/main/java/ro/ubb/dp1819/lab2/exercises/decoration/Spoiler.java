package ro.ubb.dp1819.lab2.exercises.decoration;

import ro.ubb.dp1819.lab2.exercises.CarPriceable;

public class Spoiler extends CarDecoration {
    public Spoiler(CarPriceable priceable) {
        super(priceable);
    }

    @Override
    public Long getPrice() {
        return super.priceable.getPrice() + 1L;
    }
}
