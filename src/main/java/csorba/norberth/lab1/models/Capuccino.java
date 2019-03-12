package csorba.norberth.lab1.models;

import java.util.List;

public class Capuccino extends Coffee {
    public Capuccino(List<Ingredient> ingredients) {
        super(ingredients);
    }

    @Override
    public String toString() {
        return super.toString() + " > Cappucino";
    }
}
