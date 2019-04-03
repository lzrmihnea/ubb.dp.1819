package Proxy;

import Bridge.model.Car;

import java.util.List;

public interface CreateCarInterface {
    Car createCar(List<String> carInputComponents);
}
