package lab2.Bridge.abstraction;

import lab2.Bridge.model.Car;
import lab2.Bridge.service.CarCreationService;

import java.util.Arrays;
import java.util.List;

public class CarParkCheap extends CarPark {

    public CarParkCheap(CarCreationService service) {
        super(service);
    }

    @Override
    public void buyCar() {
        List<String> carParts = Arrays.asList("summer","titanium","diesel","red");
        Car car = this.service.createCar(carParts);
        System.out.println("Bought a cheap car: "+car.toString());
    }
}
