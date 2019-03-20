package Factory;

import SOLID.Ingredient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface Coffee {
    List<Ingredient> espresso = Arrays.asList(new Ingredient(2, "cups", "water"),
            new Ingredient(0.25, "cups", "coffee-beans", "roasted"));

    List<Ingredient> cappuccino = Arrays.asList(
            new Ingredient(2, "cups", "water"),
            new Ingredient(0.25, "cups", "coffee-beans", "roasted"),
            new Ingredient(100, "ml", "milk", "foamed"));

    List<Ingredient> americano = Arrays.asList(new Ingredient(4, "cups", "water"),
            new Ingredient(0.25, "cups", "coffee-beans", "roasted"));

    List<Ingredient> macchiato = Arrays.asList(new Ingredient(50, "ml", "honey", "dark"),
            new Ingredient(0.25, "cups", "coffee-beans", "roasted"));

    public CoffeeType getType();
    public List<Ingredient> getIngredients();
}
