package Factory;

import SOLID.Ingredient;

import java.util.Arrays;
import java.util.List;

public class Americano implements Coffee {
    List<Ingredient> ingredients;

    public Americano() {
        this.ingredients = Coffee.americano;
    }

    @Override
    public CoffeeType getType() {
        return CoffeeType.AMERICANO;
    }

    @Override
    public List<Ingredient> getIngredients() {
        return this.ingredients;
    }
}
