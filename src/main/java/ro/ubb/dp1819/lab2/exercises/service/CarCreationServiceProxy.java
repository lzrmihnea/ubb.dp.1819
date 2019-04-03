package ro.ubb.dp1819.lab2.exercises.service;

import ro.ubb.dp1819.lab2.exercises.Driveable;
import ro.ubb.dp1819.lab2.exercises.ICreation;
import ro.ubb.dp1819.lab2.home.CarPart;

import java.util.List;


public class CarCreationServiceProxy implements ICreation {

    private List<CarPart> carParts;
    private CarCreationService carCreationService;

    public CarCreationServiceProxy(List<CarPart> carParts) {
        this.carParts = carParts;
        carCreationService = new CarCreationService(carParts);
    }

    @Override
    public Driveable createCar() {
        Driveable car = carCreationService.createCar();
        System.out.println("The car is: ");
        car.printCar();
        System.out.println(" and costs: " + car.getPrice());
        return car;
    }

    @Override
    public Driveable createCoolCar() {
        Driveable car = carCreationService.createCoolCar();
        car.printCar();
        System.out.println(car.getPrice());
        return car;
    }
}
