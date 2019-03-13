package ro.ubb.dp1819.grigor.sebastian.lab1.drinks;

import java.util.List;

public class Espresso extends Drink {
    public Espresso(List<Ingredient> ingredientList) {
        super(ingredientList);
    }

    @Override
    public void drink() {
        System.out.println("You are drinking an espresso.");
    }
}
