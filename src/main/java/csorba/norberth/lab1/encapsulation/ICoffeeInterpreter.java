package csorba.norberth.lab1.encapsulation;

import csorba.norberth.lab1.models.Ingredient;

import java.util.List;

public interface ICoffeeInterpreter {
    List<Ingredient> interpretIngredients(List<String> ingredients);
}
