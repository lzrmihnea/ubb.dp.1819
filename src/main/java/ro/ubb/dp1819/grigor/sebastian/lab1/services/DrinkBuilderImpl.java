package ro.ubb.dp1819.grigor.sebastian.lab1.services;

import ro.ubb.dp1819.grigor.sebastian.lab1.drinks.*;

import java.util.ArrayList;
import java.util.List;

public class DrinkBuilderImpl implements DrinkBuilder {
    private List<Ingredient> ingredients = new ArrayList<>();

    public DrinkBuilderImpl addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
        return this;
    }

    @Override
    public DrinkBuilder addIngredient(String quantity, String unit, String name) {
        ingredients.add(new Ingredient(quantity, unit, name));
        return this;
    }

    @Override
    public DrinkBuilder addIngredient(String quantity, String unit, String name, String adjective) {
        ingredients.add(new Ingredient(quantity, unit, name, adjective));
        return this;
    }

    public Drink build() {
        DrinkFactory drinkFactory = new DrinkFactoryImpl();
        return drinkFactory.makeDrink(ingredients);
    }
}

