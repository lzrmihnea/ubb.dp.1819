package ro.ubb.dp1819.luca.alex.ex1_1.entity;

import ro.ubb.dp1819.luca.alex.ex1_1.Ingredient;

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
