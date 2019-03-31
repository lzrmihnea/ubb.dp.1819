package popa.catalin.lab2;

import popa.catalin.lab1.solid.ReaderService;
import popa.catalin.lab2.decoration.CoolCar;
import popa.catalin.lab2.decoration.Nos;
import popa.catalin.lab2.domain.Car;
import popa.catalin.lab2.domain.component.AbstractCarComponent;
import popa.catalin.lab2.service.CarCreationProxyService;
import popa.catalin.lab2.service.CarCreationService;
import popa.catalin.lab2.service.CarCreationServiceInterface;

import java.util.List;

public class Lab2 {
    public static void main(String[] args) {
        CarCreationServiceInterface carCreationService = new CarCreationProxyService();
        List<String> carComponentStrings = ReaderService.readAllLines("car_comp.txt");
        Car car = carCreationService.createCar(carComponentStrings);
        System.out.println(car.getPrice());

        CoolCar coolCar = new CoolCar(car);
        coolCar.addElement(new Nos());
        System.out.println(coolCar.getPrice());
    }
}
