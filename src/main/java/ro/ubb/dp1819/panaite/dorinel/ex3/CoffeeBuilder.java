package ro.ubb.dp1819.panaite.dorinel.ex3;

import ro.ubb.dp1819.panaite.dorinel.ex1.CoffeeIngredients;
import ro.ubb.dp1819.panaite.dorinel.ex2.CompoundCoffeeIngredients;

public class CoffeeBuilder {
    CoffeeIngredients coffeeIngredients;
    CompoundCoffeeIngredients compoundCoffeeIngredients;

    public CoffeeBuilder() {
        coffeeIngredients = new CoffeeIngredients();
    }

    CoffeeBuilder(CoffeeBuilder coffeeBuilder) {
        coffeeIngredients = new CoffeeIngredients();
        compoundCoffeeIngredients = coffeeBuilder.compoundCoffeeIngredients;
        if (coffeeBuilder.compoundCoffeeIngredients == null)
            compoundCoffeeIngredients = new CompoundCoffeeIngredients(coffeeBuilder.coffeeIngredients);
        else {
            coffeeBuilder.compoundCoffeeIngredients.addSecondIngredient(coffeeBuilder.coffeeIngredients);
            compoundCoffeeIngredients = coffeeBuilder.compoundCoffeeIngredients;
        }
    }

    public CoffeeQuantityBuilder quantity(double qty) {
        this.coffeeIngredients.setQuantity(qty);
        return new CoffeeQuantityBuilder(this);
    }
}
