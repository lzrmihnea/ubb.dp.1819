package ro.ubb.dp1819.lab1.alonso.lucia.ex12;

import ro.ubb.dp1819.lab1.alonso.lucia.ex12.entity.Drinkable;
import ro.ubb.dp1819.lab1.alonso.lucia.ex11.Ingredient;


public class FactoryMethodCoffee {

    private static AbstractCoffeeFactory coffeeFactory = new StarbucksFactory();

    public static void main(String[] args) {
        Ingredient[] inglist = {new Ingredient(2, "cups", "water", null), new Ingredient(0.25, "cups", "coffee-beans", "roasted")};
        Drinkable createdCoffee = coffeeFactory.createCoffee(inglist);

        System.out.println(createdCoffee.getClass().getSimpleName()
                + " : "
                + createdCoffee.makeCoffee());
    }

}