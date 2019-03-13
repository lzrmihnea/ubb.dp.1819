package ro.ubb.dp1819.micu.emerson.domain.coffee;

import ro.ubb.dp1819.micu.emerson.domain.Ingredient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Expresso extends Coffee{

    //here we add the basic ingredients for expresso
    public Expresso(){
        ingredients = Arrays.asList(new Ingredient(2.0, "cups", "water"),
                new Ingredient(0.25, "cups", "coffee-beans", "roasted")
        );
    }

    @Override
    public String toString() {
        return "Expresso{"+ingredients.toString()+"}";
    }
}
