package popa.catalin.solid;

import popa.catalin.CoffeeException;
import popa.catalin.domain.Ingredient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IngredientService {
    public static List<Ingredient> createIngredientsFromStrings(List<String> ingredientStrings) {
        List<Ingredient> ingredients = new ArrayList<>();
        for (String ingredientString : ingredientStrings) {
            List<String> components = Arrays.asList(ingredientString.split(","));
            if (components.size() < 3)
                throw new CoffeeException("Description too small for item: " + ingredientString);

            Float quantity;
            try {
                quantity = Float.parseFloat(components.get(0));
            } catch (NumberFormatException n) {
                throw new CoffeeException("Description does not contain valid number: " + ingredientString);
            }
            String unit = components.get(1);
            String name = components.get(2);

            if (components.size() == 3)
                ingredients.add(new Ingredient(quantity, unit, name));
            else {
                String adjective = components.get(3);
                ingredients.add(new Ingredient(quantity, unit, name, adjective));
            }
        }
        return ingredients;
    }
}
