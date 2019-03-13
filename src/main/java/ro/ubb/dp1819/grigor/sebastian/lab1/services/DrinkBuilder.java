package ro.ubb.dp1819.grigor.sebastian.lab1.services;

import ro.ubb.dp1819.grigor.sebastian.lab1.drinks.Drink;
import ro.ubb.dp1819.grigor.sebastian.lab1.drinks.Ingredient;

public interface DrinkBuilder {
    DrinkBuilder addIngredient(Ingredient ingredient);

    DrinkBuilder addIngredient(String quantity, String unit, String name);

    DrinkBuilder addIngredient(String quantity, String unit, String name, String adjective);

    Drink build();
}
