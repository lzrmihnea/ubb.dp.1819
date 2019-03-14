package ro.ubb.dp1819.panaite.dorinel.ex2;

import ro.ubb.dp1819.panaite.dorinel.ex1.BaseCoffeeIngredients;
import ro.ubb.dp1819.panaite.dorinel.ex1.CoffeeIngredients;

public interface Coffee {
    CompoundCoffeeIngredients ESPRESSO = new CompoundCoffeeIngredients(new CoffeeIngredients(2, "cups", "water"),
            new CoffeeIngredients(0.25, "cups", "coffee-beans", "roasted"));

    CompoundCoffeeIngredients CAPPUCCINO = new CompoundCoffeeIngredients(
            new CoffeeIngredients(2, "cups", "water"),
                    new CompoundCoffeeIngredients(new CoffeeIngredients(0.25, "cups", "coffee-beans", "roasted"),
                            new CoffeeIngredients(100, "ml", "milk", "foamed")));

    CompoundCoffeeIngredients AMERICANO = new CompoundCoffeeIngredients(new CoffeeIngredients(4, "cups", "water"),
            new CoffeeIngredients(0.25, "cups", "coffee-beans", "roasted"));

    CompoundCoffeeIngredients LATTE = new CompoundCoffeeIngredients(new CoffeeIngredients(200, "ml", "milk", "foamed"),
            new CoffeeIngredients(0.25, "cups", "coffee-beans", "roasted"));

    BaseCoffeeIngredients getIngredients();
    String getCoffeeType();
}

class Espresso implements Coffee {
    @Override
    public BaseCoffeeIngredients getIngredients() {
        return Coffee.ESPRESSO;
    }

    @Override
    public String getCoffeeType() {
        return "Espresso";
    }
}

class Cappuccino implements Coffee {
    @Override
    public BaseCoffeeIngredients getIngredients() {
        return Coffee.CAPPUCCINO;
    }

    @Override
    public String getCoffeeType() {
        return "Cappuccino";
    }
}

class Americano implements Coffee {
    @Override
    public BaseCoffeeIngredients getIngredients() {
        return Coffee.AMERICANO;
    }

    @Override
    public String getCoffeeType() {
        return "Americano";
    }
}

class Latte implements Coffee {
    @Override
    public BaseCoffeeIngredients getIngredients() {
        return Coffee.LATTE;
    }

    @Override
    public String getCoffeeType() {
        return "Latte";
    }
}
