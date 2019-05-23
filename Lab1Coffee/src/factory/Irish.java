package factory;

import encapsulation.Ingredient;

import java.util.List;

public class Irish extends Coffee {
    private String name;
    private List<Ingredient> ingredients;

    public Irish(String name, List<Ingredient> ingredients) {
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
