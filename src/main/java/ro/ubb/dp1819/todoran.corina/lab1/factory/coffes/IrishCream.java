package ro.ubb.dp1819.todoran.corina.lab1.factory.coffes;

import ro.ubb.dp1819.todoran.corina.lab1.encapsulation.Ingredient;

import java.util.Arrays;

public class IrishCream extends Coffee {
    public IrishCream() {
        super(Arrays.asList(new Ingredient("whiskey", 500, "ml"),
                new Ingredient("milk", 500, "g", "condensed"),
                new Ingredient("instant-coffee", 1, "cups"),
                new Ingredient("chocolate-syrup", 2, "tsp"),
                new Ingredient("vanilla", 1, "tsp", "essence"),
                new Ingredient("whipped-cream", 250, "ml", "fresh")));
    }

    @Override
    public String displayCoffee() {
        return "This coffee is an irish cream. \n" + super.displayCoffee();
    }
}