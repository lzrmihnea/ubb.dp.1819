package ro.ubb.dp1819.lab1.denis_vieriu_lab1.service;

import ro.ubb.dp1819.lab1.denis_vieriu_lab1.entity.Ingredient;
import ro.ubb.dp1819.lab1.denis_vieriu_lab1.entity.IngredientBuilder;

import java.util.ArrayList;
import java.util.List;

public class ServiceCoffeStringInterpreter {
    private List<String> ingredientsAsList;

    public ServiceCoffeStringInterpreter(List<String> _ingredientsAsList) {
        ingredientsAsList = _ingredientsAsList;
    }

    public List<Ingredient> convertStringToIngredients() {
        List<Ingredient> ingredients = new ArrayList<>();

        for (String ingredientStringList : this.ingredientsAsList) {
            String[] ingredientsArrayString = ingredientStringList.split("\\s+");
            IngredientBuilder ingredientBuilder = new IngredientBuilder();
            ingredientBuilder.setQuantity(Double.valueOf(ingredientsArrayString[0]))
                    .setUnit(ingredientsArrayString[1])
                    .setIngredient(ingredientsArrayString[2]);

            if (ingredientsArrayString.length == 4) {
                ingredientBuilder.setAdjective(ingredientsArrayString[3]);
            }

            ingredients.add(ingredientBuilder.build());
        }

        return ingredients;
    }

}
