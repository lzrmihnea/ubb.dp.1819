package ro.ubb.dp1819.lab1.denis_vieriu_lab1.entity.coffee;

import ro.ubb.dp1819.lab1.denis_vieriu_lab1.entity.Ingredient;

import java.util.ArrayList;
import java.util.List;

public class Americano extends Coffee {

    private static final List<Ingredient> getAmericanoIngredients() {
        List<Ingredient> ingredientList = new ArrayList<>();

        Ingredient ingredient1 = new Ingredient(4.0f, "cups", "water");
        Ingredient ingredient2 = new Ingredient(0.25f, "cups", "coffee-beans", "roasted");
        ingredientList.add(ingredient1);
        ingredientList.add(ingredient2);

        return ingredientList;
    }

    public Americano() {
        this.ingredients = getAmericanoIngredients();
    }

    @Override
    public String toString() {
        return "Americano(" + this.ingredients + ")";
    }

    public static Boolean sameIngredients(List<Ingredient> _ingredients) {
        List<Ingredient> ingredientList = getAmericanoIngredients();

        return Coffee.compareIngredients(ingredientList, _ingredients);
    }
}
