package ro.ubb.dp1819.todoran.corina.lab1.factory;

import ro.ubb.dp1819.todoran.corina.lab1.encapsulation.Ingredient;
import ro.ubb.dp1819.todoran.corina.lab1.factory.coffes.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoffeeFactory implements ICoffeeFactory {
    public CoffeeFactory() {
        coffeeRecipes.put("espresso", Arrays.asList(new Ingredient("water", 2, "cups"),
                new Ingredient("coffee-beans", 0.25, "cups", "roasted")));

        coffeeRecipes.put("cappuccino", Arrays.asList(new Ingredient("water", 2, "cups"),
                new Ingredient("coffee-beans", 0.25, "cups", "roasted"),
                new Ingredient("milk", 100, "ml", "foamed")));

        coffeeRecipes.put("americano", Arrays.asList(new Ingredient("water", 4, "cups"),
                new Ingredient("coffee-beans", 0.25, "cups", "roasted")));

        coffeeRecipes.put("irish cream", Arrays.asList(new Ingredient("whiskey", 500, "ml"),
                new Ingredient("milk", 500, "g", "condensed"),
                new Ingredient("instant-coffee", 1, "cups"),
                new Ingredient("chocolate-syrup", 2, "tsp"),
                new Ingredient("vanilla", 1, "tsp", "essence"),
                new Ingredient("whipped-cream", 250, "ml", "fresh")));
    }

    @Override
    public ICoffee createCoffee(List<Ingredient> ingredients) throws Exception {
        List<String> possibleCoffees = new ArrayList<>(coffeeRecipes.keySet());

        coffeeRecipes.forEach( (coffee, ingredientsCoffee) -> {
            if (ingredients.size() != ingredientsCoffee.size())
                possibleCoffees.remove(coffee);
            for (Ingredient ingredient : ingredients)
                if (!ingredientsCoffee.contains(ingredient))
                    possibleCoffees.remove(coffee);
        });

        if(possibleCoffees.size() != 1)
            throw new Exception("Coffee not found.");

        switch (possibleCoffees.get(0).toLowerCase()) {
            case "espresso":
                return new Espresso();
            case "cappuccino":
                return new Cappuccino();
            case "americano":
                return new Americano();
            case "irish cream":
                return new IrishCream();
            default:
                throw new Exception("Coffee not found.");
        }
    }
}
