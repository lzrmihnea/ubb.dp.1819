package ro.ubb.dp1819.exercises.entity;

import java.util.List;

public abstract class Coffee {
    List<Ingredient> ingredients;

    public void addIngredient(Ingredient ingredient){
        ingredients.add(ingredient);
    }
    public List<Ingredient> getAll(){
        return ingredients;
    }
}
