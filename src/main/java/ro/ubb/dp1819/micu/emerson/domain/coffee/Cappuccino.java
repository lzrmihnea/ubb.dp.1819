package ro.ubb.dp1819.micu.emerson.domain.coffee;

import ro.ubb.dp1819.micu.emerson.domain.Ingredient;

import java.util.Arrays;

public class Cappuccino extends Coffee{

    //here we add the basic ingredients for cappuccino
    public Cappuccino(){
        ingredients = Arrays.asList(new Ingredient(2.0f, "cups", "water"),
                new Ingredient(0.25f, "cups", "coffee-beans", "roasted"),
                new Ingredient(100.0f, "ml", "milk", "foamed")
        );
    }

    @Override
    public String toString() {
        return "Cappuccino{"+ingredients.toString()+"}";
    }
}
