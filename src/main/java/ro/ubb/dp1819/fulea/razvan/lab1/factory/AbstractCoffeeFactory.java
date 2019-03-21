package ro.ubb.dp1819.fulea.razvan.lab1.factory;

abstract class AbstractCoffeeFactory {

    abstract ICoffee makeCoffee(CoffeeIngredients ingredients);

}

class EspressoFactory extends AbstractCoffeeFactory{

    @Override
    Espresso makeCoffee(CoffeeIngredients ingredients) {
        return new Espresso(ingredients);
    }

}

class CappuccinoFactory extends AbstractCoffeeFactory{

    @Override
    Cappuccino makeCoffee(CoffeeIngredients ingredients) {
        return new Cappuccino(ingredients);
    }

}

class AmericanoFactory extends AbstractCoffeeFactory{

    @Override
    Americano makeCoffee(CoffeeIngredients ingredients) {
        return new Americano(ingredients);
    }

}

class MorningstartFactory extends AbstractCoffeeFactory{

    @Override
    Morningstart makeCoffee(CoffeeIngredients ingredients) {
        return new Morningstart(ingredients);
    }

}