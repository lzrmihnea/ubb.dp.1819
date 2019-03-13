package ro.ubb.dp1819.grigor.sebastian.lab1.drinks;

import java.util.List;

/**
 * 1 cups water
 * 0.25 cups coffee-beans roasted
 * 1 cups milk steamed
 */
public class Cortado extends Drink {
    public Cortado(List<Ingredient> ingredientList) {
        super(ingredientList);
    }

    @Override
    public void drink() {
        System.out.println("You are drinking a cortado.");
    }
}
