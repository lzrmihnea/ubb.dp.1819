package lab1.Factory;

import lab1.SOLID.Ingredient;

import java.util.List;

public class Espresso implements Coffee {
    List<Ingredient> ingredients;

    public Espresso() {
        this.ingredients = Coffee.espresso;
    }

    @Override
    public CoffeeType getType() {
        return CoffeeType.ESPRESSO;
    }

    @Override
    public List<Ingredient> getIngredients() {
        return this.ingredients;
    }
}
