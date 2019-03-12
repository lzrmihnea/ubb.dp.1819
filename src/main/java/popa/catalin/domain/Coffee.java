package popa.catalin.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Coffee {
    protected static Ingredient twoCupsWater = new Ingredient(2.0f, "cups", "water");
    protected static Ingredient fourCupsWater = new Ingredient(4.0f, "cups", "water");
    protected static Ingredient quarterCupBeansRoasted = new Ingredient(0.25f, "cups", "coffee-beans", "roasted");
    protected static Ingredient hundredMLMilkFoamed = new Ingredient(100f, "ml", "milk", "foamed");
    protected static Ingredient hundredMLMilkSteamed = new Ingredient(100f, "ml", "milk", "steamed");

    // that moment when you realize that Java 8 doesent' allow methods to be both static and abstract...
    static List<Ingredient> getStandardIngredients() {
        return Collections.emptyList();
    }

    public abstract String drink();

    // used for extra ingredients, maybe syrup and stuff? Like Starbucks' Vanilla Latte
    private List<Ingredient> ingredients = new ArrayList<>();

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }
}

