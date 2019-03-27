package ro.ubb.dp1819.lab2.exercises.decoration;

import ro.ubb.dp1819.lab2.exercises.CarPriceable;

public class Nos extends CarDecoration {
    public Nos(CarPriceable priceable) {
        super(priceable);
    }

    @Override
    public Long getPrice() {
        return super.priceable.getPrice() + 50L;
    }
}
