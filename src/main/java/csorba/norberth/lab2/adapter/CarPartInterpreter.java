package csorba.norberth.lab2.adapter;

import csorba.norberth.lab1.models.Ingredient;
import csorba.norberth.lab2.models.CarPart;

import java.util.List;
import java.util.stream.Collectors;

public class CarPartInterpreter implements ICarPartInterpreter {
    private ICoffeeInterpreter coffeeInterpreter = new CoffeeInterpreter();

    @Override
    public List<CarPart> interpretCarParts(List<String> carParts) {
        List<Ingredient> ingredients = coffeeInterpreter.interpretIngredients(carParts);
        return ingredients.stream()
                .map(ingredient -> new CarPart((int)ingredient.getQuantity(), ingredient.getUnit(), ingredient.getActualIngredient()))
                .collect(Collectors.toList());
    }
}
