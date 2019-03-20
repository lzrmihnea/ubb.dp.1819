package ro.ubb.dp1819.lab1.exercises.entity;

import java.util.List;

public class Espresso extends CoffeeType{
    public Espresso(List<Ingredient> ingredients) {
        super(ingredients);
    }

    @Override
    public String toString() {
        return "espresso";
    }
}
