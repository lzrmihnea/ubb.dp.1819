package ro.ubb.dp1819.lab2.exercises.decoration;

import ro.ubb.dp1819.lab2.exercises.Car;
import ro.ubb.dp1819.lab2.exercises.component.CarComponent;

import java.util.List;

public abstract class CarDecorations extends Car {
    protected Car car;

    public CarDecorations(Car car) {
        this.car = car;
    }

    @Override
    public String show() {
           return this.car.show();
    }

    @Override
    public List<CarComponent> getComponents() {
        return this.car.getComponents();
    }
    public Long getPrice(){
        return 0L;
    }
}
