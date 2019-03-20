package ro.ubb.dp1819.lab1.denis_vieriu_lab1.entity.coffee;

import ro.ubb.dp1819.lab1.denis_vieriu_lab1.entity.Ingredient;

import java.util.ArrayList;
import java.util.List;

public class Latte extends Coffee {

    private static final List<Ingredient> getLatteIngredients() {
        List<Ingredient> ingredientList = new ArrayList<>();

        Ingredient ingredient1 = new Ingredient(2.0f, "cups", "water");
        Ingredient ingredient2 = new Ingredient(0.25f, "cups", "coffee-beans", "roasted");
        Ingredient ingredient3 = new Ingredient(100f, "milk", "milk", "steamed");
        ingredientList.add(ingredient1);
        ingredientList.add(ingredient2);
        ingredientList.add(ingredient3);

        return ingredientList;
    }

    public Latte() {
        this.ingredients = getLatteIngredients();
    }

    @Override
    public String toString() {
        return "Latte(" + this.ingredients + ")";
    }

    public static Boolean sameIngredients(List<Ingredient> _ingredients) {
        List<Ingredient> ingredientList = getLatteIngredients();
        return Coffee.compareIngredients(ingredientList, _ingredients);
    }
}
