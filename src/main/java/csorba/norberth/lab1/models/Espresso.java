package csorba.norberth.lab1.models;

import java.util.List;

public class Espresso extends Coffee {
    public Espresso(List<Ingredient> ingredients) {
        super(ingredients);
    }

    @Override
    public String toString() {
        return super.toString() + " > Espresso";
    }
}
