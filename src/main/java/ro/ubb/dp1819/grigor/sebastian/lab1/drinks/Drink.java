package ro.ubb.dp1819.grigor.sebastian.lab1.drinks;

import java.util.List;

public class Drink {
    private List<Ingredient> ingredients;

    public Drink(List<Ingredient> ingredientList) {
        this.ingredients = ingredientList;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void drink() {
        System.out.println("You are drinking random ingredients in a cup. Delicious!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drink drink = (Drink) o;
        return drink.ingredients.size() == ingredients.size() && drink.ingredients.containsAll(ingredients);
    }
}
