package csorba.norberth.lab1.models;

import java.util.List;

public class DefaultCoffee extends Coffee {
    public DefaultCoffee(List<Ingredient> ingredients) {
        super(ingredients);
    }

    @Override
    public String toString() {
        return super.toString() + " > DefaultCoffee";
    }
}
