package ro.ubb.dp1819.todoran.corina.lab2.adapter;

import ro.ubb.dp1819.todoran.corina.lab2.model.CarPart;

import java.util.List;

public interface ICarPartInterpreter {
    List<CarPart> interpretCarParts(List<String> fileLines);
}
