package ro.ubb.dp1819.grigor.sebastian.lab1.services;

import ro.ubb.dp1819.grigor.sebastian.lab1.drinks.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DrinkFactoryImpl implements DrinkFactory {
    private static final List<Ingredient> ESPRESSO_INGREDIENTS = Collections.unmodifiableList(
            new ArrayList<Ingredient>() {{
                add(new Ingredient("2", "cups", "water"));
                add(new Ingredient("0.25", "cups", "coffee-beans", "roasted"));
            }}
    );

    private static final List<Ingredient> CAPPUCCINO_INGREDIENTS = Collections.unmodifiableList(
            new ArrayList<Ingredient>() {{
                add(new Ingredient("2", "cups", "water"));
                add(new Ingredient("0.25", "cups", "coffee-beans", "roasted"));
                add(new Ingredient("100", "ml", "milk", "foamed"));
            }}
    );

    private static final List<Ingredient> AMERICANO_INGREDIENTS = Collections.unmodifiableList(
            new ArrayList<Ingredient>() {{
                add(new Ingredient("4", "cups", "water"));
                add(new Ingredient("0.25", "cups", "coffee-beans", "roasted"));
            }}
    );

    private static final List<Ingredient> CORTADO_INGREDIENTS = Collections.unmodifiableList(
            new ArrayList<Ingredient>() {{
                add(new Ingredient("1", "cups", "water"));
                add(new Ingredient("0.25", "cups", "coffee-beans", "roasted"));
                add(new Ingredient("1", "cups", "milk", "steamed"));
            }}
    );

    @Override
    public Drink makeDrink(List<Ingredient> ingredients) {
        // ESPRESSO
        if (ingredients.size() == ESPRESSO_INGREDIENTS.size() && ingredients.containsAll(ESPRESSO_INGREDIENTS)) {
            return new Espresso(ingredients);
        }
        // AMERICANO
        if (ingredients.size() == AMERICANO_INGREDIENTS.size() && ingredients.containsAll(AMERICANO_INGREDIENTS)) {
            return new Americano(ingredients);
        }
        // CAPPUCCINO
        if (ingredients.size() == CAPPUCCINO_INGREDIENTS.size() && ingredients.containsAll(CAPPUCCINO_INGREDIENTS)) {
            return new Cappuccino(ingredients);
        }
        // CORTADO
        if (ingredients.size() == CORTADO_INGREDIENTS.size() && ingredients.containsAll(CORTADO_INGREDIENTS)) {
            return new Cortado(ingredients);
        }
        // RANDOM
        return new Drink(ingredients);
    }
}
