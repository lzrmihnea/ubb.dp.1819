package Pb2;

import Pb1.Ingredient;

import java.util.List;

public class LatteMacchiato extends Coffee {
    private String name;
    private List<Ingredient> ingredients;

//    public LatteMacchiato(String name, List<Ingredient> ingredients) {
//        this.name = name;
//        this.ingredients = ingredients;
//    }
    public LatteMacchiato(CoffeeBuilder builder) {
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
