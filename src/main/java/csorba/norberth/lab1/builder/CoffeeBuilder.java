package csorba.norberth.lab1.builder;

import csorba.norberth.lab1.models.Coffee;
import csorba.norberth.lab1.models.DefaultCoffee;
import csorba.norberth.lab1.models.Ingredient;

import java.util.ArrayList;
import java.util.List;

public class CoffeeBuilder {
    private List<Ingredient> ingredients = new ArrayList<>();

    public CoffeeBuilder addIngredient(Ingredient ingredient){
        this.ingredients.add(ingredient);
        return this;
    }

    public Coffee build(){
        return new DefaultCoffee(this.ingredients);
    }
}
