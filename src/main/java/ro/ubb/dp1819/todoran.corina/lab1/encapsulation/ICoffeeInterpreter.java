package ro.ubb.dp1819.todoran.corina.lab1.encapsulation;

import ro.ubb.dp1819.todoran.corina.lab1.model.Ingredient;

import java.util.List;

public interface ICoffeeInterpreter {
    List<Ingredient> interpretIngredients(List<String> fileLines);
}
