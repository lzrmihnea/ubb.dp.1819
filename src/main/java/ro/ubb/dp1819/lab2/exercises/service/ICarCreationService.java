package ro.ubb.dp1819.lab2.exercises.service;

import ro.ubb.dp1819.lab2.exercises.Car;

import java.util.List;

public interface ICarCreationService {
    Car createCar(List<String> carInputComponents);
}
