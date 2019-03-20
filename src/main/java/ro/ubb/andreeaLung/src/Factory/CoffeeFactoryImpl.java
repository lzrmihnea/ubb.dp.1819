package Factory;

import SOLID.Ingredient;

import java.util.List;

public class CoffeeFactoryImpl implements CoffeeFactory {

    @Override
    public Coffee getCoffee(List<Ingredient> coffeeIngredients) throws CoffeeIngredientsInterpreterException {
        if (coffeeIngredients.equals(Coffee.espresso))
            return new Espresso();
        else if (coffeeIngredients.equals(Coffee.cappuccino))
            return new Cappuccino();
        else if (coffeeIngredients.equals(Coffee.americano))
            return new Americano();
        else if (coffeeIngredients.equals(Coffee.macchiato))
            return new Macchiato();
        else throw new CoffeeIngredientsInterpreterException("No such coffee is avaiable!");
    }
}
