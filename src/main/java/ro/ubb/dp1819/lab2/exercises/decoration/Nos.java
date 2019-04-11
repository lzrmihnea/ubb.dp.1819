package ro.ubb.dp1819.lab2.exercises.decoration;

import ro.ubb.dp1819.lab2.exercises.Car;

public class Nos extends CarDecorations {


    public Nos(Car car) {
        super(car);
    }

    @Override
    public String show() {
        return super.show() + "NOS \n";
    }

    @Override
    public Long getPrice() {
        return super.getPrice() + 30L;
    }

}
