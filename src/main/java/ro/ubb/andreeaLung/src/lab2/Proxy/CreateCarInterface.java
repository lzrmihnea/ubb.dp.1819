package lab2.Proxy;

import lab2.Bridge.model.Car;

import java.util.List;

public interface CreateCarInterface {
    Car createCar(List<String> carInputComponents);
}
