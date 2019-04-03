package ro.ubb.dp1819.lab1.exercises.factory;

import ro.ubb.dp1819.lab1.exercises.entity.*;

import java.util.List;
import java.util.stream.Collectors;

import static ro.ubb.dp1819.lab1.exercises.utils.Constants.*;

public class CoffeeFactory implements AbstractFactory {

    public Coffee brewCoffee(final List<Ingredient> ingredients) {
        if (isEspresso(ingredients)) {
            final Ingredient waterIngredient = getWaterIngredient(ingredients);
            final Ingredient coffeeBeansIngredient = getCoffeeBeansIngredient(ingredients);

            return Espresso.builder()
                    .water(waterIngredient)
                    .coffeeBeans(coffeeBeansIngredient)
                    .build();
        }

        if (isCappuccino(ingredients)) {
            final Ingredient waterIngredient = getWaterIngredient(ingredients);
            final Ingredient coffeeBeansIngredient = getCoffeeBeansIngredient(ingredients);
            final Ingredient milkIngredient = getMilkIngredient(ingredients);

            return Cappuccino.builder()
                    .water(waterIngredient)
                    .coffeeBeans(coffeeBeansIngredient)
                    .milk(milkIngredient)
                    .build();
        }

        if (isAmericano(ingredients)) {
            final Ingredient waterIngredient = getWaterIngredient(ingredients);
            final Ingredient coffeeBeansIngredient = getCoffeeBeansIngredient(ingredients);

            return Americano.builder()
                    .water(waterIngredient)
                    .coffeeBeans(coffeeBeansIngredient)
                    .build();
        }

        if (isLongBlack(ingredients)) {
            final Ingredient waterIngredient = getWaterIngredient(ingredients);
            final Ingredient coffeeBeansIngredient = getCoffeeBeansIngredient(ingredients);

            return LongBlack.builder()
                    .water(waterIngredient)
                    .coffeeBeans(coffeeBeansIngredient)
                    .build();
        }

        System.out.println("Cannot brew any coffee with these ingredients.");
        return null;
    }

    private static boolean isEspresso(final List<Ingredient> ingredients) {
        if (ingredients.size() != 2)
            return false;

        return ingredients.contains(TWO_CUPS_WATER) &&
                ingredients.contains(QUARTER_CUPS_COFFEE_BEANS_ROASTED);
    }

    private static boolean isCappuccino(final List<Ingredient> ingredients) {
        if (ingredients.size() != 3)
            return false;

        return ingredients.contains(TWO_CUPS_WATER) &&
                ingredients.contains(QUARTER_CUPS_COFFEE_BEANS_ROASTED) &&
                ingredients.contains(HUNDRED_ML_MILK_FOAMED);
    }

    private static boolean isAmericano(final List<Ingredient> ingredients) {
        if (ingredients.size() != 2)
            return false;

        return ingredients.contains(FOUR_CUPS_WATER) &&
                ingredients.contains(QUARTER_CUPS_COFFEE_BEANS_ROASTED);
    }

    private static boolean isLongBlack(final List<Ingredient> ingredients) {
        if (ingredients.size() != 2)
            return false;

        return ingredients.contains(FOUR_CUPS_WATER) &&
                ingredients.contains(HALF_CUPS_COFFEE_BEANS_ROASTED);
    }

    private static Ingredient getWaterIngredient(final List<Ingredient> ingredients) {
        final List<Ingredient> waterIngredients = ingredients.stream()
                .filter(ingredient -> ingredient.getName().equals(WATER))
                .collect(Collectors.toList());

        if (waterIngredients.size() != 1) {
            System.out.println("List of ingredients does not have water.");
            return null;
        }
        
        return ingredients.get(0);
    }

    private static Ingredient getCoffeeBeansIngredient(final List<Ingredient> ingredients) {
        final List<Ingredient> waterIngredients = ingredients.stream()
                .filter(ingredient -> ingredient.getName().equals(COFFEE_BEANS))
                .collect(Collectors.toList());

        if (waterIngredients.size() != 1) {
            System.out.println("List of ingredients does not have coffee-beans.");
            return null;
        }
        
        return ingredients.get(0);
    }

    private static Ingredient getMilkIngredient(final List<Ingredient> ingredients) {
        final List<Ingredient> waterIngredients = ingredients.stream()
                .filter(ingredient -> ingredient.getName().equals(MILK))
                .collect(Collectors.toList());

        if (waterIngredients.size() != 1) {
            System.out.println("List of ingredients does not have milk.");
            return null;
        }
        
        return ingredients.get(0);
    }

}
