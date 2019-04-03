package Bridge.service;
import Bridge.model.Car;
import Proxy.CreateCarInterface;

import java.util.List;

public abstract class CarCreationService implements CreateCarInterface  {
    public abstract Car createCar(List<String> carInputComponents);
}
