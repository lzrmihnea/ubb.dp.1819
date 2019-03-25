package csorba.norberth.lab2.exercises.service;

import csorba.norberth.lab2.exercises.Car;

import java.util.List;

public interface ICarCreationService {
    Car createCar(List<String> carInputComponents);
}