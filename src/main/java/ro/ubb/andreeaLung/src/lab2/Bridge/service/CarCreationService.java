package lab2.Bridge.service;
import lab2.Bridge.model.Car;
import lab2.Proxy.CreateCarInterface;

import java.util.List;

public abstract class CarCreationService implements CreateCarInterface  {
    public abstract Car createCar(List<String> carInputComponents);
}
