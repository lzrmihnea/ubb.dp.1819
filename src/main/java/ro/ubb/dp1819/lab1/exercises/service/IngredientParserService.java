package ro.ubb.dp1819.lab1.exercises.service;

import ro.ubb.dp1819.lab1.exercises.entity.Ingredient;
import ro.ubb.dp1819.lab1.exercises.exception.InvalidCoffeeException;

import java.util.List;
import java.util.stream.Collectors;

public class IngredientParserService {
    private static Ingredient parseIngredient(String input) {
        String[] tokens = input.split(" ");

        if (tokens.length == 4) {
            return new Ingredient.Builder()
                    .setQuantity(tokens[0])
                    .setUnit(tokens[1])
                    .setIngredient(tokens[2])
                    .setAdjective(tokens[3])
                    .build();
        }
        if (tokens.length == 3) {
            return new Ingredient.Builder()
                    .setQuantity(tokens[0])
                    .setUnit(tokens[1])
                    .setIngredient(tokens[2])
                    .build();
        }
        throw new InvalidCoffeeException("Incorrect number of tokens in input string");
    }

    public static List<Ingredient> parseIngredients(List<String> input) {
        return input.stream().map(IngredientParserService::parseIngredient).collect(Collectors.toList());
    }
}
