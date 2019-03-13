package ro.ubb.dp1819.micu.emerson.domain.coffee;

import ro.ubb.dp1819.micu.emerson.domain.Ingredient;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public abstract class Coffee {
    protected  List<Ingredient> ingredients;

    public void addIngredient(Ingredient ingredient){
        ingredients.add(ingredient);
    }
    public List<Ingredient> getIngredients(){
        return ingredients;
    }
}
