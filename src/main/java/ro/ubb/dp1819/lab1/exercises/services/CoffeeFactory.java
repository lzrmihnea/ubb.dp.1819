package ro.ubb.dp1819.lab1.exercises.services;

import ro.ubb.dp1819.lab1.exercises.entity.*;

import java.util.List;

//mytype:  4 cups water + 0.25 cups coffee-beans roasted + 0.25 cups sugar + 150 ml foamed milk
public class CoffeeFactory {
    public CoffeeType getCoffee(List<Ingredient> ingredients) {
        if (ingredients == null)
            return null;
        CoffeeType coffeeType;
        if (ingredients.size() == 3) {
            coffeeType = new CoffeeType.Builder()
                    .addIngredient(ingredients.get(0))
                    .addIngredient(ingredients.get(1))
                    .addIngredient(ingredients.get(2))
                    .build();
        }else{
            coffeeType = new CoffeeType.Builder()
                    .addIngredient(ingredients.get(0))
                    .addIngredient(ingredients.get(1))
                    .build();
        }

        return coffeeType;
    }
}
