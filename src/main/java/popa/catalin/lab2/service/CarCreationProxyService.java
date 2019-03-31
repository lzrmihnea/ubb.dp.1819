package popa.catalin.lab2.service;

import org.springframework.stereotype.Service;
import popa.catalin.lab2.domain.Car;
import popa.catalin.lab2.domain.component.AbstractCarComponent;

import java.util.List;

@Service
public class CarCreationProxyService implements CarCreationServiceInterface {
    public Car createCar(List<String> carInputComponents) {
        CarCreationService carCreationService = new CarCreationService();
        Car car = carCreationService.createCar(carInputComponents);
        for (AbstractCarComponent carComponent : car.getCarComponentList())
            System.out.println(carComponent.toString() + " " + carComponent.getPrice().toString());
        return car;
    }
}
