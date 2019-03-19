package Factory;

import SOLID.Ingredient;

import java.util.List;

public interface CoffeeFactory {
    Coffee getCoffee(List<Ingredient> coffeeIngredients) throws CoffeeIngredientsInterpreterException;
}
