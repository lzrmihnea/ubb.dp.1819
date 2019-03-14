package ro.ubb.dp1819.exercises.entity;

import java.util.Arrays;

public class Cappuccino extends Coffee{

    public Cappuccino(){
        ingredients = Arrays.asList(new Ingredient(2.0f, "cups", "water"),
                new Ingredient(0.25f, "cups", "coffee-beans", "roasted"),
                new Ingredient(100.0f, "ml", "milk", "foamed")
        );
    }

    @Override
    public String toString() {
        return "Cappuccino: "+ingredients.toString();
    }
}