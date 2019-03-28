package ro.ubb.dp1819.lab1.exercises;

import ro.ubb.dp1819.lab1.exercises.entity.CoffeeBuilder;
import ro.ubb.dp1819.lab1.exercises.entity.Drinkable;

public class CoffeeFactory implements AbstractFactory {
    private String[] waterCups;
    private String[] coffeeCups;

    @Override
    public Drinkable makeCoffee(String ingredients) {
        ingredients = ingredients.trim();
        String[] strs = ingredients.split("\\+");
        waterCups = strs[0].trim().split(" ");
        coffeeCups = strs[1].trim().split(" ");

        if (checkEspresso(ingredients))
            return new CoffeeBuilder().builder("espresso")
                    .setNoCupsWater(Integer.parseInt(waterCups[0]))
                    .setNoCupsCoffee(Double.parseDouble(coffeeCups[0]))
                    .coffeeType("roasted")
                    .build();

        if (checkCappuccino(ingredients))
            return new CoffeeBuilder().builder("CAPPUCCINO")
                    .setNoCupsWater(Integer.parseInt(waterCups[0]))
                    .setNoCupsCoffee(Double.parseDouble(coffeeCups[0]))
                    .coffeeType("roasted")
                    .extraIngredients(strs[strs.length - 1])
                    .build();

        if (checkAmericano(ingredients))
            return new CoffeeBuilder().builder("Americano")
                    .setNoCupsWater(Integer.parseInt(waterCups[0]))
                    .setNoCupsCoffee(Double.parseDouble(coffeeCups[0]))
                    .coffeeType("roasted")
                    .build();

        if (checkLatte(ingredients))
            return new CoffeeBuilder().builder("Latte")
                    .setNoCupsWater(Integer.parseInt(waterCups[0]))
                    .setNoCupsCoffee(Double.parseDouble(coffeeCups[0]))
                    .coffeeType("roasted")
                    .extraIngredients(strs[strs.length - 1])
                    .build();

        return null;
    }

    private boolean checkEspresso(String ingredients) {
        return ingredients.contains("water")
                && ingredients.contains("coffee-beans roasted")
                && waterCups[0].contains("2")
                && !ingredients.contains("milk")
                && !ingredients.contains("sugar");
    }

    private boolean checkCappuccino(String ingredients) {
        return ingredients.contains("water")
                && ingredients.contains("coffee-beans roasted")
                && ingredients.contains("milk");
    }

    private boolean checkAmericano(String ingredients) {
        return ingredients.contains("water")
                && ingredients.contains("coffee-beans roasted")
                && waterCups[0].contains("4")
                && !ingredients.contains("milk")
                && !ingredients.contains("sugar");
    }

    private boolean checkLatte(String ingredients) {
        return ingredients.contains("water")
                && ingredients.contains("coffee-beans roasted")
                && ingredients.contains("sugar");
    }
}
