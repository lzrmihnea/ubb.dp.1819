package ro.ubb.dp1819.todoran.corina.lab1.factory.coffes;

import ro.ubb.dp1819.todoran.corina.lab1.encapsulation.Ingredient;

import java.util.Arrays;

public class Cappuccino extends Coffee {
    public Cappuccino() {
        super(Arrays.asList(new Ingredient("water", 2, "cups"),
                new Ingredient("coffee-beans", 0.25, "cups", "roasted"),
                new Ingredient("milk", 100, "ml", "foamed")));
    }

    @Override
    public String displayCoffee() {
        return "This coffee is a cappuccino. \n" + super.displayCoffee();
    }
}