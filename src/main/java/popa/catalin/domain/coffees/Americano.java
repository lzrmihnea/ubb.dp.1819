package popa.catalin.domain.coffees;

import popa.catalin.domain.Coffee;
import popa.catalin.domain.Ingredient;

import java.util.Arrays;
import java.util.List;

public class Americano extends Coffee {
    //americano: 4 cups water + 0.25 cups coffee-beans roasted
    public static List<Ingredient> getStandardIngredients() {
        return Arrays.asList(fourCupsWater, quarterCupBeansRoasted);
    }

    @Override
    public String drink() {
        return "Very strong";
    }
}
