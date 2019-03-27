package ro.ubb.dp1819.todoran.corina.lab2.adapter;

import ro.ubb.dp1819.todoran.corina.lab1.encapsulation.CoffeeInterpreter;
import ro.ubb.dp1819.todoran.corina.lab1.encapsulation.ICoffeeInterpreter;
import ro.ubb.dp1819.todoran.corina.lab2.model.CarPart;

import java.util.List;
import java.util.stream.Collectors;

public class CarPartInterpreter implements ICarPartInterpreter {
    private ICoffeeInterpreter coffeeInterpreter = new CoffeeInterpreter();

    @Override
    public List<CarPart> interpretCarParts(List<String> fileLines) {

        return coffeeInterpreter.interpretIngredients(fileLines).stream()
                .map(ingredient -> new CarPart((int)ingredient.getQuantity(), ingredient.getUnit(), ingredient.getName()))
                .collect(Collectors.toList());
    }
}
