package csorba.norberth.lab1.encapsulation;

import csorba.norberth.lab1.models.Ingredient;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

public class CoffeeInterpreter implements ICoffeeInterpreter {

    @Override
    public List<Ingredient> interpretIngredients(List<String> ingredientsAsStrings) {
        List<Ingredient> ingredients = new ArrayList<>();

        ingredientsAsStrings.forEach(ingr -> {
            String[] words = ingr.split("[ ]");
            if (words.length != 3 && words.length != 4) {
                throw new InvalidParameterException();
            }

            double quantity = Double.parseDouble(words[0]);
            String unit = words[1];
            String actualIngredient = words[2];
            String adjective = words.length >= 4 ? words[3] : null;

            ingredients.add(new Ingredient(quantity,unit,actualIngredient,adjective));
        });

        return ingredients;
    }

}
