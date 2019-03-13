package ro.ubb.dp1819.micu.emerson.domain.coffee;

import ro.ubb.dp1819.micu.emerson.domain.Ingredient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpecialCoffee extends Coffee{

    //we will add our own ingredients
    public SpecialCoffee(){
        ingredients = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "SpecialCoffee{"+ingredients.toString()+"}";
    }
}
