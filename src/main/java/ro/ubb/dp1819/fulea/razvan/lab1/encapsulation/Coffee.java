package ro.ubb.dp1819.fulea.razvan.lab1.encapsulation;

import java.util.ArrayList;
import java.util.List;

class Coffee {

    private List<CoffeeIngredient> ingredients;

    public Coffee() {
        this.ingredients = new ArrayList<>();
    }

    public Coffee(List<CoffeeIngredient> ingredients) {
        this.ingredients = ingredients;
    }

    public void addIngredient(CoffeeIngredient ingredient){
        this.ingredients.add(ingredient);
    }

    @Override
    public String toString() {
        StringBuilder ingredientString = new StringBuilder();
        for (CoffeeIngredient ingredient: ingredients){
            ingredientString.append(ingredient).append(",\n");
        }
        return "Coffee{" +
                "ingredients=\n" + ingredientString.toString() +
                '}';
    }
}