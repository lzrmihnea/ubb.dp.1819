package ro.ubb.dp1819.lab1.exercises.entity;

import java.util.List;

public class Latte extends CoffeeType{
    public Latte(List<Ingredient> ingredients) {
        super(ingredients);
    }

    @Override
    public String toString() {
        return "latte";
    }
}
