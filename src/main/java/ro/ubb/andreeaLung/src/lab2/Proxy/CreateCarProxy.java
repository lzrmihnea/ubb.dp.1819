package lab2.Proxy;

import lab2.Bridge.model.Car;
import lab2.Bridge.service.CarCreationService;

import java.util.List;

public class CreateCarProxy implements CreateCarInterface{
    CarCreationService carCreationService;

    public CreateCarProxy(CarCreationService carCreationService) {
        this.carCreationService = carCreationService;
    }

    @Override
    public Car createCar(List<String> carInputComponents) {
        Car createdCar = carCreationService.createCar(carInputComponents);
        System.out.println(createdCar.toString() + "Cost: " + createdCar.getPrice());
        return createdCar;
    }
}
