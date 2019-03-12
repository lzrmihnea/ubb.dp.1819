package ro.ubb.dp1819.todoran.corina.lab1.factory.coffes;

import ro.ubb.dp1819.todoran.corina.lab1.encapsulation.Ingredient;

import java.util.Arrays;

public class Espresso extends Coffee {
    public Espresso() {
        super(Arrays.asList(new Ingredient("water", 2, "cups"),
                new Ingredient("coffee-beans", 0.25, "cups", "roasted")));
    }

    @Override
    public String displayCoffee() {
        return "This coffee is an espresso. \n" + super.displayCoffee();
    }
}