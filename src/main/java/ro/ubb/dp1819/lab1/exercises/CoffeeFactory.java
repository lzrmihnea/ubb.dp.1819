package ro.ubb.dp1819.lab1.exercises;

import org.springframework.stereotype.Component;
import ro.ubb.dp1819.lab1.exercises.entity.*;
import ro.ubb.dp1819.lab1.exercises.exception.InvalidCoffeeException;

import java.util.Arrays;
import java.util.List;

@Component
public class CoffeeFactory implements AbstractCoffeeFactory {

    private static List<Ingredient> espresso = Arrays.asList(
            new Ingredient(2.0f, "cups", "water", null),
            new Ingredient(0.25f, "cups", "coffee-beans", "roasted")
    );
    private static List<Ingredient> cappuccino = Arrays.asList(
            new Ingredient(2.0f, "cups", "water", null),
            new Ingredient(0.25f, "cups", "coffee-beans", "roasted"),
            new Ingredient(100.0f, "ml", "milk", "foamed")
    );
    private static List<Ingredient> latte = Arrays.asList(
            new Ingredient(4.0f, "cups", "water", null),
            new Ingredient(0.25f, "cups", "coffee-beans", "roasted")
    );

    private static List<Ingredient> notTooColdWater = Arrays.asList(
            new Ingredient(220.0f, "ml", "water", "cold"),
            new Ingredient(30.0f, "ml", "water", "warm")
    );

    public Drinkable makeCoffee(List<Ingredient> ingredients) {

        if (similar(ingredients, latte))
            return new Latte();
        if (similar(ingredients, espresso))
            return new Espresso();
        if (similar(ingredients, cappuccino))
            return new Cappuccino();
        if (similar(ingredients, notTooColdWater))
            return new NotTooColdWater();
        throw new InvalidCoffeeException("No coffee configured with those ingredients: " + ingredients);
    }

    private static boolean similar(List<Ingredient> a, List<Ingredient> b) {
        return a.containsAll(b) && a.size() == b.size();
    }
}
