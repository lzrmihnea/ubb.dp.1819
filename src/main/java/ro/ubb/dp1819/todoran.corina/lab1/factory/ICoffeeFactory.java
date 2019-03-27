package ro.ubb.dp1819.todoran.corina.lab1.factory;

import ro.ubb.dp1819.todoran.corina.lab1.model.Ingredient;
import ro.ubb.dp1819.todoran.corina.lab1.factory.coffes.ICoffee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ICoffeeFactory {
    Map<String, List<Ingredient>> coffeeRecipes = new HashMap<>();
    ICoffee createCoffee(List<Ingredient> ingredients) throws Exception;
}
