package Bridge.service;
import Bridge.model.Car;

import java.util.List;

public abstract class CarCreationService {
    public abstract Car createCar(List<String> carInputComponents);
}
