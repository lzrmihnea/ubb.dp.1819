package csorba.norberth.lab1.models;

import java.util.List;

public class Americano extends Coffee {
    public Americano(List<Ingredient> ingredients) {
        super(ingredients);
    }

    @Override
    public String toString() {
        return super.toString() + " > Americano";
    }
}
