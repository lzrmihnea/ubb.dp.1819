package popa.catalin.lab2.decoration;

import popa.catalin.lab2.domain.Car;
import popa.catalin.lab2.domain.Driveable;
import popa.catalin.lab2.pricing.CarPricingComposite;

public class CoolCar extends CarPricingComposite<CarDecoration> implements Driveable {
    private Car car;

    public CoolCar(Car car) {
        this.car = car;
    }

    @Override
    public void Drive() {
        System.out.println("COOLER VROOM VROOM !!");
    }

    @Override
    public Long getPrice() {
        Long sum = car.getPrice();
        for (CarDecoration element : elements)
            sum += element.getPrice();
        return sum;
    }
}
