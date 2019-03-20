package ro.ubb.dp1819.lab1.exercises.entity;

import java.util.List;

public class Americano extends CoffeeType{
    public Americano(List<Ingredient> ingredients) {
        super(ingredients);
    }

    @Override
    public String toString() {
        return "americano";
    }
}
