package ro.ubb.dp1819.panaite.dorinel.ex2;

import ro.ubb.dp1819.panaite.dorinel.ex1.CoffeeIngredients;

public interface Coffee {
    CompoundCoffeeIngredients ESPRESSO = new CompoundCoffeeIngredients(new CoffeeIngredients(2, "cups", "water"),
            new CoffeeIngredients(0.25, "cups", "coffee-beans", "roasted"));

    CompoundCoffeeIngredients CAPPUCCINO = new CompoundCoffeeIngredients(
            new CompoundCoffeeIngredients(new CoffeeIngredients(2, "cups", "water"),
                    new CompoundCoffeeIngredients(new CoffeeIngredients(0.25, "cups", "coffee-beans", "roasted"),
                            new CoffeeIngredients(100, "ml", "milk", "foamed")))
    );
}

//0.25 cups coffee-beans roasted + 100ml foamed milk
