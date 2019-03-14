package ro.ubb.dp1819.panaite.dorinel.ex3;

import ro.ubb.dp1819.panaite.dorinel.ex1.CoffeeIngredients;

public class CoffeeUnitBuilder extends CoffeeBuilder {
    CoffeeUnitBuilder(CoffeeBuilder coffeeBuilder) {
        this.coffeeIngredients = coffeeBuilder.coffeeIngredients;
        this.compoundCoffeeIngredients = coffeeBuilder.compoundCoffeeIngredients;
    }

    public CoffeeIngredientBuilder ingredient(String ingredient) {
        this.coffeeIngredients.setIngredient(ingredient);
        return new CoffeeIngredientBuilder(this);
    }
}
