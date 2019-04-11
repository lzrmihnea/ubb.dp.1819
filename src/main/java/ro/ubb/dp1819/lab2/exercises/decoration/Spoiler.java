package ro.ubb.dp1819.lab2.exercises.decoration;

import ro.ubb.dp1819.lab2.exercises.Car;

public class Spoiler extends CarDecorations {


    public Spoiler(Car car) {
        super(car);
    }

    @Override
    public String show() {
        return super.show() + "spoiler \n";
    }

    @Override
    public Long getPrice() {
        return super.getPrice() + 20L;
    }

}
