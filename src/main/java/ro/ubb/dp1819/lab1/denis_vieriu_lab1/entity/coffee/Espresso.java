package ro.ubb.dp1819.lab1.denis_vieriu_lab1.entity.coffee;

import ro.ubb.dp1819.lab1.denis_vieriu_lab1.entity.Ingredient;

import java.util.ArrayList;
import java.util.List;

public class Espresso extends Coffee {

    private static final List<Ingredient> getEspressoIngredients() {
        List<Ingredient> ingredientList = new ArrayList<>();

        Ingredient ingredient1 = new Ingredient(2.0f, "cups", "water");
        Ingredient ingredient2 = new Ingredient(0.25f, "cups", "coffee-beans", "roasted");
        ingredientList.add(ingredient1);
        ingredientList.add(ingredient2);

        return ingredientList;
    }

    public Espresso() {
        this.ingredients = getEspressoIngredients();
    }

    @Override
    public String toString() {
        return "Espresso(" + this.ingredients + ")";
    }

    public static Boolean sameIngredients(List<Ingredient> _ingredients) {
        List<Ingredient> ingredientList = getEspressoIngredients();
        return Coffee.compareIngredients(ingredientList, _ingredients);
    }
}
