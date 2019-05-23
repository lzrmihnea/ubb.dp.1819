package Pb2;

import Pb1.Ingredient;

import java.util.List;

public class Espresso extends Coffee {
    private String name;
    private List<Ingredient> ingredients;

//    public Espresso(String name, List<Ingredient> ingredients) {
//        this.name = name;
//        this.ingredients = ingredients;
//    }

    public Espresso(CoffeeBuilder builder) {
        this.name = builder.getName();
        this.ingredients = builder.getIngredients();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<Ingredient> getIngredients() {
        return ingredients;
    }
}
