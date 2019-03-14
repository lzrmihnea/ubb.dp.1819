package ro.ubb.dp1819.exercises.service;

import ro.ubb.dp1819.exercises.entity.Ingredient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InterpretService {

    public static List<Ingredient> interpret(final List<String> ingredientLines) {
        final List<Ingredient> ingredients = new ArrayList<>();

        for (String ingredientLine : ingredientLines) {
            final List<String> words = Arrays.asList(ingredientLine.split(" "));
            final int wordsCount = words.size();

            if (wordsCount < 3 || wordsCount > 4) {
                System.out.println("Ignoring invalid line: " + ingredientLine);
                continue;
            }

            final double quantity = Double.parseDouble(words.get(0));
            final String unit = words.get(1);
            final String name = words.get(2);
            final String adjective = (wordsCount == 4) ? words.get(3) : null;

            final Ingredient ingredient = Ingredient.builder()
                    .quantity(quantity)
                    .unit(unit)
                    .name(name)
                    .adjective(adjective)
                    .build();

            ingredients.add(ingredient);
        }

        return ingredients;
    }

}
