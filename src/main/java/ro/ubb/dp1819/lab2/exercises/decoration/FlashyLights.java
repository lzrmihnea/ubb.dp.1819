package ro.ubb.dp1819.lab2.exercises.decoration;

import ro.ubb.dp1819.lab2.exercises.Car;

public class FlashyLights extends CarDecorations {


    public FlashyLights(Car car) {
        super(car);
    }

    @Override
    public String show() {
        return super.show() + "flash lights \n";
    }

    @Override
    public Long getPrice() {
        return super.getPrice() + 10L;
    }


}
