package ro.ubb.dp1819.exercises.entity;


import java.util.Arrays;

public class Americano extends Coffee {

    public Americano(){
        ingredients = Arrays.asList(new Ingredient(4.0f, "cups", "water"),
                new Ingredient(0.25f, "cups", "coffee-beans", "roasted")
        );
    }

    @Override
    public String toString() {
        return "Americano: " + ingredients.toString();
    }
}