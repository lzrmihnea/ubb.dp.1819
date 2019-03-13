package ro.ubb.dp1819.grigor.sebastian.lab1.drinks;

import java.util.List;

public class Cappuccino extends Drink {
    public Cappuccino(List<Ingredient> ingredientList) {
        super(ingredientList);
    }

    @Override
    public void drink() {
        System.out.println("You are drinking a cappuccino.");
    }
}
