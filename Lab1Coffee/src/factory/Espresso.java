package factory;

import encapsulation.Ingredient;

import java.util.List;

public class Espresso extends Coffee{
    private String name;
    private List<Ingredient> ingredients;

    public Espresso(String name, List<Ingredient> ingredients){
        this.name = name;
        this.ingredients = ingredients;
    }

    @Override
    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return name;
    }
}
