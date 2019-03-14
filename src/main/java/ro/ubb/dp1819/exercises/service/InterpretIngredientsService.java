package ro.ubb.dp1819.exercises.service;

import ro.ubb.dp1819.exercises.entity.Ingredient;
import ro.ubb.dp1819.exercises.exception.CoffeeException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InterpretIngredientsService {

    public static List<Ingredient> interpretAsIngredients(List<String> ingredientsAsStrings) {
        List<Ingredient> ingredients = new ArrayList<>();

        for (String ingredientString : ingredientsAsStrings) {
            List<String> tokens = Arrays.asList(ingredientString.split(","));
            if (tokens.size() < 3)
                throw new CoffeeException("Too small: " + ingredientString);

            Float quantity;
            try {
                quantity = Float.parseFloat(tokens.get(0));
            } catch (NumberFormatException n) {
                throw new CoffeeException("You need a quantity: " + ingredientString);
            }
            String unit = tokens.get(1);
            String name = tokens.get(2);

            if (tokens.size() == 3)
                ingredients.add(new Ingredient(quantity, unit, name));
            else {
                String adjective = tokens.get(3);
                ingredients.add(new Ingredient(quantity, unit, name, adjective));
            }
        }
        return ingredients;
    }
}
