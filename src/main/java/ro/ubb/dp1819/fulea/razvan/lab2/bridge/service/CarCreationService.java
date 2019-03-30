package ro.ubb.dp1819.fulea.razvan.lab2.bridge.service;

import ro.ubb.dp1819.fulea.razvan.lab2.bridge.model.Car;

import java.util.List;

public abstract class CarCreationService {

    public abstract Car createCar(List<String> carInputComponents);

}
