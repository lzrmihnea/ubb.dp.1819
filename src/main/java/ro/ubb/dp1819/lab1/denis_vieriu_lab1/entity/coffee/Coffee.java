package ro.ubb.dp1819.lab1.denis_vieriu_lab1.entity.coffee;

import ro.ubb.dp1819.lab1.denis_vieriu_lab1.entity.Ingredient;

import java.util.List;

public abstract class Coffee {
    List<Ingredient> ingredients;

    public void addCoffeeIngredient(Ingredient ingredient) {
        this.ingredients.add(ingredient);
    }

    public List<Ingredient> getCoffeeIngredients() {
        return ingredients;
    }

    public static Boolean compareIngredients(List<Ingredient> ingredientList, List<Ingredient> _ingredients) {
        if (ingredientList.size() != _ingredients.size()) {
            return false;
        }

        for (int i = 0; i < ingredientList.size(); i++)
        {
            Ingredient ingredientL = ingredientList.get(i);
            Ingredient ingredientR = _ingredients.get(i);

            if (!ingredientL.equals(ingredientR)) {
                return false;
            }
        }

        return true;
    }
}
