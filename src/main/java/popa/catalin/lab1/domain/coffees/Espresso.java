package popa.catalin.lab1.domain.coffees;

import popa.catalin.lab1.domain.Coffee;
import popa.catalin.lab1.domain.Ingredient;

import java.util.Arrays;
import java.util.List;

public class Espresso extends Coffee {
    // espresso: 2 cups water + 0.25 cups coffee-beans roasted
    public static List<Ingredient> getStandardIngredients() {
        return Arrays.asList(twoCupsWater, quarterCupBeansRoasted);
    }

    @Override
    public String drink() {
        return "Small but strong";
    }
}
