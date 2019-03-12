package popa.catalin.factory;

import popa.catalin.domain.Coffee;
import popa.catalin.domain.Ingredient;
import popa.catalin.domain.coffees.*;
import popa.catalin.domain.coffees.*;

import java.util.List;

public class IllyCoffeeFactory implements CoffeeFactory {

    @Override
    public Coffee makeCoffee(List<Ingredient> ingredients) {
        if (ingredients == null)
            return new Covfefe();
        else if (ingredients.equals(Espresso.getStandardIngredients()))
            return new Espresso();
        else if (ingredients.equals(Cappuccino.getStandardIngredients()))
            return new Cappuccino();
        else if (ingredients.equals(Americano.getStandardIngredients()))
            return new Americano();
        else if (ingredients.equals(CafeLatte.getStandardIngredients()))
            return new CafeLatte();
        else
            return new Covfefe();
    }
}
