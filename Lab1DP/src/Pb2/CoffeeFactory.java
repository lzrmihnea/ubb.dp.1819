package Pb2;

import Pb1.Ingredient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CoffeeFactory {
    private static Ingredient i1 = new Ingredient("water", 2.0, "cups");
    private static Ingredient i2 = new Ingredient("coffee-beans", 0.25, "cups", "roasted");
    private static Ingredient i3 = new Ingredient("milk", 100.0, "ml", "foamed");
    private static Ingredient i4 = new Ingredient("water", 4.0, "cups");
    private static Ingredient i5 = new Ingredient("milk", 200.0, "ml", "foamed");

    private static List<Ingredient> espresso = new ArrayList<>(Arrays.asList(i1,i2));
    private static List<Ingredient> cappuccino = new ArrayList<>(Arrays.asList(i1,i2,i3));
    private static List<Ingredient> americano = new ArrayList<>(Arrays.asList(i4, i2));
    private static List<Ingredient> latteMacchiato = new ArrayList<>(Arrays.asList(i1, i2, i5));

    public static Coffee getCoffee(List<Ingredient> ingredients) throws Exception {
        if (espresso.equals(ingredients)) {
            return new Coffee.CoffeeBuilder("espresso").setIngredients(ingredients).build();
        } else if(cappuccino.equals(ingredients)) {
            return new Coffee.CoffeeBuilder("cappuccino").setIngredients(ingredients).build();
        } else if(americano.equals(ingredients)) {
            return new Coffee.CoffeeBuilder("americano").setIngredients(ingredients).build();
        } else if(latteMacchiato.equals(ingredients)) {
//            return new Coffee.CoffeeBuilder("latte macchiato").setIngredients(ingredients).build();
            return new Coffee.CoffeeBuilder("latte macchiato").build();
        } else {
            throw new Exception("This type of coffee doesn't exist!");
        }
    }
}
