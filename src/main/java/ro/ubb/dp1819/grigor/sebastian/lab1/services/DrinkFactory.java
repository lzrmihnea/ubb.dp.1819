package ro.ubb.dp1819.grigor.sebastian.lab1.services;

import ro.ubb.dp1819.grigor.sebastian.lab1.drinks.Drink;
import ro.ubb.dp1819.grigor.sebastian.lab1.drinks.Ingredient;

import java.util.List;

public interface DrinkFactory {
    Drink makeDrink(List<Ingredient> ingredients);
}
