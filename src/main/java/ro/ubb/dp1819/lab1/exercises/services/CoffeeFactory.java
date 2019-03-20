package ro.ubb.dp1819.lab1.exercises.services;

import ro.ubb.dp1819.lab1.exercises.entity.*;

import java.util.List;

//mytype:  4 cups water + 0.25 cups coffee-beans roasted + 0.25 cups sugar + 150 ml foamed milk
public class CoffeeFactory {
    public Coffee getCoffee(List<Ingredient> ingredients) {
        if (ingredients == null)
            return null;

        Ingredient ingred1 = ingredients.get(0);
        Ingredient ingred2 = ingredients.get(1);
        Ingredient ingred3 = null;

        if (ingredients.size() == 3){
            ingred3 = ingredients.get(2);
        }

        if (ingred2.getQuantity() == 0.25 && ingred2.getIngredient().equals(IngredientType.COFFEE_BEANS) && ingred2.getAdjective().equals(AdjectiveType.ROASTED)){
            if (ingred1.getUnit().equals(UnitType.CUPS) && ingred1.getIngredient().equals(IngredientType.WATER)) {
                if (ingred1.getQuantity() == 2) {
                    if (ingredients.size() == 2) {
                        return new Espresso();
                    } else if (ingred3.getQuantity() == 100 && ingred3.getUnit().equals(UnitType.ML) && ingred3.getIngredient().equals(IngredientType.MILK)) {
                        return new Cappuccino();
                    }
                } else if (ingred1.getQuantity() == 4){
                    if (ingredients.size() == 2){
                        return new Americano();
                    } else if (ingred3.getQuantity() == 200 && ingred3.getUnit().equals(UnitType.ML) && ingred3.getIngredient().equals(IngredientType.MILK)){
                        return new Latte();
                    }
                }
            }
        }

        return null;
    }
}
