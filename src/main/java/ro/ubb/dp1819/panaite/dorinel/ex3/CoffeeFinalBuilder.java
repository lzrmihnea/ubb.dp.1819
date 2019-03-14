package ro.ubb.dp1819.panaite.dorinel.ex3;

import ro.ubb.dp1819.panaite.dorinel.ex1.BaseCoffeeIngredients;

public class CoffeeFinalBuilder extends CoffeeBuilder {
    CoffeeFinalBuilder(CoffeeBuilder coffeeBuilder) {
        this.coffeeIngredients = coffeeBuilder.coffeeIngredients;
        this.compoundCoffeeIngredients = coffeeBuilder.compoundCoffeeIngredients;
    }

    public CoffeeBuilder newIngredients() {
        return new CoffeeBuilder(this);
    }

    public BaseCoffeeIngredients build() {
        if (compoundCoffeeIngredients == null)
            return this.coffeeIngredients;
        else {
            compoundCoffeeIngredients.addSecondIngredient(this.coffeeIngredients);
            return this.compoundCoffeeIngredients;
        }
    }
}
