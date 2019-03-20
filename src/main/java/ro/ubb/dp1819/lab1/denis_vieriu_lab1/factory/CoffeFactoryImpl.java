package ro.ubb.dp1819.lab1.denis_vieriu_lab1.factory;

import ro.ubb.dp1819.lab1.denis_vieriu_lab1.entity.Ingredient;
import ro.ubb.dp1819.lab1.denis_vieriu_lab1.entity.coffee.*;

import java.util.List;

public class CoffeFactoryImpl implements CoffeeFactory {

    enum CoffeeType {
        ESPRESSO,
        CAPPUCINO,
        AMERICANO,
        LATTE
    }

    ;

    @Override
    public Coffee coffee(List<Ingredient> ingredientList) {
        CoffeeType coffeeType = getCoffeeType(ingredientList);
        System.out.println("coffee type found: " + coffeeType);
        switch (coffeeType) {
            case ESPRESSO:
                return new Espresso();
            case CAPPUCINO:
                return new Cappuccino();
            case AMERICANO:
                return new Americano();
            case LATTE:
                return new Latte();
            default:
                throw new RuntimeException("No coffee found");

        }
    }

    private CoffeeType getCoffeeType(List<Ingredient> ingredients) {
        if (Cappuccino.sameIngredients(ingredients)) {
            return CoffeeType.CAPPUCINO;
        }

        if (Americano.sameIngredients(ingredients)) {
            return CoffeeType.AMERICANO;
        }

        if (Espresso.sameIngredients(ingredients)) {
            return CoffeeType.ESPRESSO;
        }

        if (Latte.sameIngredients(ingredients)) {
            return CoffeeType.LATTE;
        }

        throw new RuntimeException("No coffee found");
    }
}
