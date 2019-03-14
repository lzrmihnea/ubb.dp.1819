package ro.ubb.dp1819.panaite.dorinel.ex3;

import ro.ubb.dp1819.panaite.dorinel.ex1.CoffeeIngredients;

public class CoffeeIngredientBuilder extends CoffeeFinalBuilder {
    CoffeeIngredientBuilder(CoffeeBuilder coffeeBuilder) {
        super(coffeeBuilder);
        this.coffeeIngredients = coffeeBuilder.coffeeIngredients;
        this.compoundCoffeeIngredients = coffeeBuilder.compoundCoffeeIngredients;
    }

    public CoffeeAdjectiveBuilder adjective(String adjective) {
        this.coffeeIngredients.setAdjective(adjective);
        return new CoffeeAdjectiveBuilder(this);
    }
}
