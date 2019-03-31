package popa.catalin.lab2.service;

import org.springframework.stereotype.Service;
import popa.catalin.lab2.domain.Car;
import popa.catalin.lab2.domain.component.AbstractCarComponent;

import java.util.List;

@Service
public interface CarCreationServiceInterface {
    Car createCar(List<String> carInputComponents);
}
