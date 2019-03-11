package ro.ubb.dp1819.exercises.entity;

import ro.ubb.dp1819.exercises.Ingredient;

import java.util.ArrayList;
import java.util.List;

public abstract class Drinkable {

    private List<Ingredient> ingredients;

    public Drinkable() {
        this.ingredients = new ArrayList<>();
    }


    public abstract String taste();

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}
