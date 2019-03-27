package ro.ubb.dp1819.lab2.exercises.decoration;

import ro.ubb.dp1819.lab2.exercises.CarPriceable;
import ro.ubb.dp1819.lab2.exercises.Driveable;

public class CoolCar extends CarDecoration {
    public CoolCar(CarPriceable priceable) {
        super(priceable);
    }

    @Override
    public Long getPrice() {
        return super.priceable.getPrice() + 2L;
    }
}
