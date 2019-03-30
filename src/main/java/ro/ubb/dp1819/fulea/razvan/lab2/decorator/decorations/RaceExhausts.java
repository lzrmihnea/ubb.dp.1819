package ro.ubb.dp1819.fulea.razvan.lab2.decorator.decorations;

import ro.ubb.dp1819.fulea.razvan.lab2.decorator.CarPriceable;

public class RaceExhausts extends CarDecoration {

    public RaceExhausts(CarPriceable carPriceable) {
        super(carPriceable);
    }

    @Override
    public Long getPrice() {
        return super.getPrice() + 60L;
    }

    @Override
    public String toString() {
        return super.toString() + " with Race exhausts";
    }
}
