package csorba.norberth.lab1.models;

import java.security.InvalidParameterException;
import java.util.List;

public abstract class Coffee {
    private List<Ingredient> ingredients;

    public Coffee(List<Ingredient> ingredients) {
        if(ingredients.size() == 0){
            throw new InvalidParameterException();
        }

        this.ingredients = ingredients;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Coffee";
    }
}
