package ro.ubb.dp1819.lab1.exercises.entity;

import java.util.ArrayList;
import java.util.List;

public abstract class CoffeeType {
    private List<Ingredient> ingredients;

    public CoffeeType(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public static class Builder{
        private List<Ingredient> ingredients = new ArrayList<>();

        public Builder(){}

        public Builder addIngredient(Ingredient ingredient){
            this.ingredients.add(ingredient);
            return this;
        }

        public CoffeeType build(){
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
                            return new Espresso(ingredients);
                        } else if (ingred3.getQuantity() == 100 && ingred3.getUnit().equals(UnitType.ML) && ingred3.getIngredient().equals(IngredientType.MILK)) {
                            return new Cappuccino(ingredients);
                        }
                    } else if (ingred1.getQuantity() == 4){
                        if (ingredients.size() == 2){
                            return new Americano(ingredients);
                        } else if (ingred3.getQuantity() == 200 && ingred3.getUnit().equals(UnitType.ML) && ingred3.getIngredient().equals(IngredientType.MILK)){
                            return new Latte(ingredients);
                        }
                    }
                }
            }
            return null;
        }
    }
}
