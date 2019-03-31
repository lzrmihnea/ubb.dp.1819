package popa.catalin.lab2.service;

import org.springframework.stereotype.Service;
import popa.catalin.lab2.domain.component.*;
import popa.catalin.lab2.domain.Car;

import java.util.List;

@Service
public class CarCreationService implements CarCreationServiceInterface {
    public Car createCar(List<String> carInputComponents) {
        CarComponentServiceInterface carComponentService = new CarComponentService();
        List<AbstractCarComponent> carComponents = carComponentService.createComponentsFromStrings(carInputComponents);
        return new Car(carComponents);
    }
}
