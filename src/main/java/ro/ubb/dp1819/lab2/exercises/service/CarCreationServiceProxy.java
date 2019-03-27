package ro.ubb.dp1819.lab2.exercises.service;

import ro.ubb.dp1819.lab2.exercises.Car;
import ro.ubb.dp1819.todoran.corina.lab2.adapter.CarPartInterpreter;

import java.util.List;

public class CarCreationServiceProxy implements ICarCreationService {
    private ICarCreationService realService = new CarCreationService(new CarPartInterpreter());

    @Override
    public Car createCar(List<String> carInputComponents) {
        Car car = this.realService.createCar(carInputComponents);
        System.out.println(car + " ------> " + car.getPrice());
        return car;
    }
}
