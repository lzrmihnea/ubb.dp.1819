package ro.ubb.dp1819.luca.alex.ex1_1;

import ro.ubb.dp1819.luca.alex.ex1_1.entity.*;
import ro.ubb.dp1819.luca.alex.ex1_3.CoffeeBuilder;

import java.util.ArrayList;
import java.util.List;

public class LucaCoffeeFactory implements CoffeeFactory {
    @Override
    public Drinkable prepareCoffee(List<String> ingredientLines) throws CoffeeException {
        List<Ingredient> ingredients = new ArrayList<>();
        for (String ingrendient : ingredientLines) {
            String[] splittedLine = ingrendient.split(",");
            ingredients.add(new Ingredient(Double.valueOf(splittedLine[0]), splittedLine[1], splittedLine[2],
                    splittedLine.length == 4 ? splittedLine[3] : null));
        }

        Ingredient ingredient1 = new Ingredient(2, "cups", "water", null);
        Ingredient ingredient2 = new Ingredient(0.25, "cups", "coffee-beans", "roasted");
        Ingredient ingredient3 = new Ingredient(100, "ml", "milk", "foamed");
        Ingredient ingredient4 = new Ingredient(4, "cups", "water", null);
        Ingredient ingredient5 = new Ingredient(100, "ml", "milk", "steamed");

        if (ingredients.contains(ingredient1) && ingredients.contains(ingredient2)) {
            if (ingredients.size() == 2) {
                return new CoffeeBuilder(CoffeeType.ESPRESSO)
                        .addIngredient(ingredients.get(0))
                        .addIngredient(ingredients.get(1))
                        .build();
            }
            if (ingredients.contains(ingredient3)) {
                return new CoffeeBuilder(CoffeeType.CAPPUCCINO)
                        .addIngredient(ingredients.get(0))
                        .addIngredient(ingredients.get(1))
                        .addIngredient(ingredients.get(2))
                        .build();
            }
            if (ingredients.contains(ingredient5)) {
                return new CoffeeBuilder(CoffeeType.LATTE)
                        .addIngredient(ingredients.get(0))
                        .addIngredient(ingredients.get(1))
                        .addIngredient(ingredients.get(2))
                        .build();
            }
        }
        if (ingredients.size() == 2 && ingredients.contains(ingredient4) && ingredients.contains(ingredient2)) {
            return new CoffeeBuilder(CoffeeType.AMERICANO)
                    .addIngredient(ingredients.get(0))
                    .addIngredient(ingredients.get(1))
                    .build();
        }

        throw new CoffeeException("No coffee can be prepared with these ingredients");
    }
}
