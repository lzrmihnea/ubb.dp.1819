package ro.ubb.dp1819.lab2.exercises.decoration;

import ro.ubb.dp1819.lab2.exercises.CarPriceable;

public class FlashyLights extends CarDecoration {
    public FlashyLights(CarPriceable priceable) {
        super(priceable);
    }

    @Override
    public Long getPrice() {
        return super.priceable.getPrice() + 100L;
    }
}
