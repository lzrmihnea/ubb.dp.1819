package ro.ubb.dp1819.grigor.sebastian.lab1.drinks;

import java.util.List;

public class Cortado extends Drink {
    public Cortado(List<Ingredient> ingredientList) {
        super(ingredientList);
    }

    @Override
    public void drink() {
        System.out.println("You are drinking a cortado.");
    }
}
