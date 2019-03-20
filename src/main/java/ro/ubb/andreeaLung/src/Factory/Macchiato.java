package Factory;

import SOLID.Ingredient;

import java.util.Arrays;
import java.util.List;

public class Macchiato implements Coffee {
    List<Ingredient> ingredients;

    public Macchiato() {
        this.ingredients = Coffee.macchiato;
    }

    @Override
    public CoffeeType getType() {
        return CoffeeType.MACCHIATO;
    }

    @Override
    public List<Ingredient> getIngredients() {
        return this.ingredients;
    }
}
