package ro.ubb.dp1819.fulea.razvan.lab2.decorator.decorations;

import ro.ubb.dp1819.fulea.razvan.lab2.decorator.CarPriceable;

public class Neons extends CarDecoration {

    public Neons(CarPriceable carPriceable) {
        super(carPriceable);
    }

    @Override
    public Long getPrice() {
        return super.getPrice() + 25L;
    }

    @Override
    public String toString() {
        return super.toString() + " with Neons";
    }
}
