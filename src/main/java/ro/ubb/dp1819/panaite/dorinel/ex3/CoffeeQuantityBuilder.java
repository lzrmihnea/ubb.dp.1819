package ro.ubb.dp1819.panaite.dorinel.ex3;

import ro.ubb.dp1819.panaite.dorinel.ex1.CoffeeIngredients;

public class CoffeeQuantityBuilder extends CoffeeBuilder {
    CoffeeQuantityBuilder(CoffeeBuilder coffeeBuilder) {
        this.coffeeIngredients = coffeeBuilder.coffeeIngredients;
        this.compoundCoffeeIngredients = coffeeBuilder.compoundCoffeeIngredients;
    }

    public CoffeeUnitBuilder unit(String unit) {
        this.coffeeIngredients.setUnit(unit);
        return new CoffeeUnitBuilder(this);
    }
}
