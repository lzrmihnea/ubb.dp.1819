package popa.catalin.lab1;

import popa.catalin.lab1.builder.CoffeeBuilder;
import popa.catalin.lab1.domain.Ingredient;
import popa.catalin.lab1.domain.Coffee;
import popa.catalin.lab1.factory.CoffeeFactory;
import popa.catalin.lab1.factory.IllyCoffeeFactory;
import popa.catalin.lab1.solid.IngredientService;
import popa.catalin.lab1.solid.ReaderService;

import java.util.Arrays;
import java.util.List;

public class Lab1 {

    public static void main(String[] args) {
        System.out.println("Lines in file: ");
        List<String> ingredientStrings = ReaderService.readAllLines("coffees.txt");
        for (String ingredientString : ingredientStrings)
            System.out.println(ingredientString);

        System.out.println();
        System.out.println("Ingredients in file: ");
        List<Ingredient> ingredients = IngredientService.createIngredientsFromStrings(ingredientStrings);
        for (Ingredient ingredient : ingredients)
            System.out.println(ingredient.toString());

        // ---

        Ingredient twoCupsWater = new Ingredient(2.0f, "cups", "water");
        Ingredient fourCupsWater = new Ingredient(4.0f, "cups", "water");
        Ingredient quarterCupBeansRoasted = new Ingredient(0.25f, "cups", "coffee-beans", "roasted");
        Ingredient hundredMLMilkFoamed = new Ingredient(100f, "ml", "milk", "foamed");
        Ingredient hundredMLMilkSteamed = new Ingredient(100f, "ml", "milk", "steamed");

        System.out.println();
        CoffeeFactory coffeeFactory = new IllyCoffeeFactory();
        Coffee createdCoffee = coffeeFactory.makeCoffee(null);
        System.out.println(createdCoffee.getClass().getSimpleName() + " : " + createdCoffee.drink());
        Coffee anotherCoffee = coffeeFactory.makeCoffee(Arrays.asList(twoCupsWater, quarterCupBeansRoasted, hundredMLMilkSteamed));
        System.out.println(anotherCoffee.getClass().getSimpleName() + " : " + anotherCoffee.drink());

        // ---

        CoffeeBuilder coffeeBuilder = new CoffeeBuilder();

        List<Ingredient> classicCofvefe = Arrays.asList(fourCupsWater, quarterCupBeansRoasted, hundredMLMilkFoamed);
        for (Ingredient ingredient : classicCofvefe)
            coffeeBuilder = coffeeBuilder.ingredient(ingredient); //coffeeBuilder.ingredient(fourCupsWater).ingredient(quarterCupBeansRoasted).ingredient(hundredMLMilkFoamed) would also work

        Coffee coffee = coffeeBuilder.build();
        System.out.println();
        for (Ingredient ingredient : coffee.getIngredients())
            System.out.println(ingredient.toString());
        System.out.println(coffee.drink());
    }
}
