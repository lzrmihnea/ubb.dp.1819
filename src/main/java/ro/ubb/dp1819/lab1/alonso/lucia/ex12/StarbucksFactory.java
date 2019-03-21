package ro.ubb.dp1819.lab1.alonso.lucia.ex12;

import ro.ubb.dp1819.lab1.alonso.lucia.ex12.entity.*;
import ro.ubb.dp1819.lab1.alonso.lucia.ex11.Ingredient;
import ro.ubb.dp1819.lab1.alonsolucia.ex12.entity.*;

public class StarbucksFactory implements AbstractCoffeeFactory {

    @Override
    public Drinkable createCoffee(Ingredient ingredients[]){

        if (ingredients[0].equals(new Ingredient(2, "cups", "water", null))
                && ingredients[1].equals(new Ingredient(0.25, "cups", "coffee-beans", "roasted")))
        { return new Expresso(); }

        if (ingredients[0].equals(new Ingredient(2, "cups", "water", null))
                && ingredients[1].equals(new Ingredient(0.25, "cups", "coffee-roasted", "roasted"))
                && ingredients[2].equals(new Ingredient(100, "ml", "milk", "foamed")))
        { return new Cappuccino(); }

        if (ingredients[0].equals(new Ingredient(4, "cups", "water", null))
                && ingredients[1].equals(new Ingredient(0.25, "cups", "coffee-beans", "roasted")))
        { return new Americano(); }

        if (ingredients[0].equals(new Ingredient(2, "cups", "water", null))
                && ingredients[1].equals(new Ingredient(0.5, "cups", "coffee-beans", "roasted"))
                && ingredients[2].equals(new Ingredient(20, "ml", "milk", "foamed")))
        { return new Macchiato(); }

        System.out.println ("Bad ingredients!");
        return null;

    }

}
