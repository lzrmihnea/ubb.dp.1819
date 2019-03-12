package popa.catalin.domain.coffees;

import popa.catalin.domain.Coffee;
import popa.catalin.domain.Ingredient;

import java.util.Arrays;
import java.util.List;

public class CafeLatte extends Coffee {
    // NOT to be confused with a Cappuccino; what are we, filthy casuals ?!
    public static List<Ingredient> getStandardIngredients() {
        return Arrays.asList(twoCupsWater, quarterCupBeansRoasted, hundredMLMilkSteamed);
    }

    @Override
    public String drink() {
        return "Artsy coffee";
    }
}
