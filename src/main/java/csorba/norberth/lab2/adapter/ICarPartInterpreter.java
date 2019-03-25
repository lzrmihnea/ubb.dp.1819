package csorba.norberth.lab2.adapter;

import csorba.norberth.lab2.models.CarPart;

import java.util.List;

public interface ICarPartInterpreter {
    List<CarPart> interpretCarParts(List<String> carParts);

}
