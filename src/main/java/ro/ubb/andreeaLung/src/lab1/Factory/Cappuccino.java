package lab1.Factory;

import lab1.SOLID.Ingredient;

import java.util.List;

public class Cappuccino implements Coffee {
    List<Ingredient> ingredients;

    public Cappuccino() {
        this.ingredients = Coffee.cappuccino;
    }

    @Override
    public CoffeeType getType() {
        return CoffeeType.CAPPUCCINO;
    }

    @Override
    public List<Ingredient> getIngredients() {
        return this.ingredients;
    }
}
