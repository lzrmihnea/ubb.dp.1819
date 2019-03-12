package ro.ubb.dp1819.todoran.corina.lab1.factory.coffes;

import ro.ubb.dp1819.todoran.corina.lab1.encapsulation.Ingredient;

import java.util.Arrays;

public class Americano extends Coffee {
    public Americano() {
        super(Arrays.asList(new Ingredient("water", 4, "cups"),
                new Ingredient("coffee-beans", 0.25, "cups", "roasted")));
    }

    @Override
    public String displayCoffee() {
        return "This coffee is an americano. \n" + super.displayCoffee();
    }
}
