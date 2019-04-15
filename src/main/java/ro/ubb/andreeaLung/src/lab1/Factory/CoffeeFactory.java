package lab1.Factory;

import lab1.SOLID.Ingredient;

import java.util.List;

public interface CoffeeFactory {
    Coffee getCoffee(List<Ingredient> coffeeIngredients) throws CoffeeIngredientsInterpreterException;
}
