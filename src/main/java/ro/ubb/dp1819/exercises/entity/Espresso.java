package ro.ubb.dp1819.exercises.entity;

import java.util.Arrays;

public class Espresso extends Coffee{

    public Espresso(){
        ingredients = Arrays.asList(new Ingredient(2.0f, "cups", "water"),
                new Ingredient(0.25f, "cups", "coffee-beans", "roasted")
        );
    }

    @Override
    public String toString() {
        return "Expresso: "+ingredients.toString();
    }
}
