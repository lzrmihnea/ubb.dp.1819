package Pb2;

import Pb1.Ingredient;

import java.util.List;

public class Cappuccino extends Coffee {
    private String name;
    private List<Ingredient> ingredients;

//    public Cappuccino(String name, List<Ingredient> ingredients) {
//        this.name = name;
//        this.ingredients = ingredients;
//    }

    public Cappuccino(CoffeeBuilder builder) {
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
