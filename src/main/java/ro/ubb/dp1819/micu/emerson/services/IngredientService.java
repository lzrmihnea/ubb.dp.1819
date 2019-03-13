package ro.ubb.dp1819.micu.emerson.services;

import ro.ubb.dp1819.micu.emerson.domain.Ingredient;

import java.util.ArrayList;
import java.util.List;

public class IngredientService {

    //we assume that input is in correct format
    public List<Ingredient> convertStringsToIngredients(List<String> strings){
        List<Ingredient> ingredients = new ArrayList<>();

        for(String string : strings){
            String[] elements = string.split(" ");

            Ingredient.IngredientBuilder builder = new Ingredient.IngredientBuilder();
            builder.setQuantity(Double.valueOf(elements[0]))
                    .setUnit(elements[1])
                    .setIngredient(elements[2]);

            if(elements.length > 3){
               builder.setAdjective(elements[3]);
            }

            ingredients.add(builder.build());
        }

        return ingredients;
    }
}
