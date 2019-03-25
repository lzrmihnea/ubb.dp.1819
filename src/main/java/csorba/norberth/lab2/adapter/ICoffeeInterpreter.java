package csorba.norberth.lab2.adapter;

import csorba.norberth.lab1.models.Ingredient;

import java.util.List;

public interface ICoffeeInterpreter {
    List<Ingredient> interpretIngredients(List<String> ingredients);
}
