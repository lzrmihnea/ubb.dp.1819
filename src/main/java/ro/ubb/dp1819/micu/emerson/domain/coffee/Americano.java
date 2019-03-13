package ro.ubb.dp1819.micu.emerson.domain.coffee;

import ro.ubb.dp1819.micu.emerson.domain.Ingredient;

import java.util.Arrays;

public class Americano extends Coffee {

    //here we add the basic ingredients for americano
    public Americano(){
        ingredients = Arrays.asList(new Ingredient(4.0f, "cups", "water"),
                new Ingredient(0.25f, "cups", "coffee-beans", "roasted")
        );
    }

    @Override
    public String toString() {
        return "Cappuccino{"+ingredients.toString()+"}";
    }
}
