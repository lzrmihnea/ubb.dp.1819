package csorba.norberth.lab2.exercises.service;

import csorba.norberth.lab2.adapter.CarPartInterpreter;
import csorba.norberth.lab2.exercises.Car;

import java.util.List;

public class CarCreationServiceProxy implements ICarCreationService {

    private ICarCreationService realService = new CarCreationService(new CarPartInterpreter());

    @Override
    public Car createCar(List<String> carInputComponents) {
        Car car = this.realService.createCar(carInputComponents);
        System.out.println(car);
        System.out.println(car.getPrice());
        return car;
    }
}
