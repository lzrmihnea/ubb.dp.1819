package lab1.Factory;

import lab1.SOLID.Ingredient;

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
