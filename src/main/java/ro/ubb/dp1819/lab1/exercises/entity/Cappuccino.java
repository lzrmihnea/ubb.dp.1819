package ro.ubb.dp1819.lab1.exercises.entity;

import java.util.List;

public class Cappuccino extends CoffeeType{
    public Cappuccino(List<Ingredient> ingredients) {
        super(ingredients);
    }

    @Override
    public String toString() {
        return "cappuccino";
    }
}
