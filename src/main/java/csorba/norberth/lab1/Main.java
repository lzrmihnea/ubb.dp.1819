package csorba.norberth.lab1;

import csorba.norberth.lab1.builder.CoffeeBuilder;
import csorba.norberth.lab1.encapsulation.CoffeeInterpreter;
import csorba.norberth.lab1.encapsulation.FileReaderService;
import csorba.norberth.lab1.encapsulation.ICoffeeInterpreter;
import csorba.norberth.lab1.encapsulation.IReaderService;
import csorba.norberth.lab1.factory.CoffeeFactory;
import csorba.norberth.lab1.factory.ICoffeeFactory;
import csorba.norberth.lab1.models.Coffee;
import csorba.norberth.lab1.models.Ingredient;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        encapsulation();
        System.out.println();
        factory();
        System.out.println();
        builder();
    }

    private static void encapsulation() {
        IReaderService readerService = new FileReaderService();
        ICoffeeInterpreter coffeeInterpreter = new CoffeeInterpreter();
        try {
            List<Ingredient> ingredients = coffeeInterpreter
                    .interpretIngredients(readerService.read("src\\main\\java\\csorba\\norberth\\lab1\\ingredients.txt"));
            ingredients.forEach(System.out::println);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private static void factory() {
        ICoffeeFactory coffeeFactory = new CoffeeFactory();
        try{
            Ingredient[] espressoIngredients = new Ingredient[]{
                    new Ingredient(2, "cups", "water", null),
                    new Ingredient(0.25, "cups", "coffee-beans", "roasted")
            };
            Coffee espresso = coffeeFactory.create(Arrays.asList(espressoIngredients));
            System.out.println(espresso);

            Ingredient[] capuccinoIngredients = new Ingredient[]{
                    new Ingredient(2, "cups", "water", null),
                    new Ingredient(0.25, "cups", "coffee-beans", "roasted"),
                    new Ingredient(100, "ml", "milk", "foamed")
            };
            Coffee capuccino = coffeeFactory.create(Arrays.asList(capuccinoIngredients));
            System.out.println(capuccino);

            Ingredient[] americanoIngredients = new Ingredient[]{
                    new Ingredient(4, "cups", "water", null),
                    new Ingredient(0.25, "cups", "coffee-beans", "roasted")
            };
            Coffee americano = coffeeFactory.create(Arrays.asList(americanoIngredients));
            System.out.println(americano);

        }catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }

    }

    private static void builder(){
        Coffee coffee = new CoffeeBuilder()
                .addIngredient(new Ingredient(2, "cups", "water", null))
                .addIngredient(new Ingredient(0.25, "cups", "coffee-beans", "roasted"))
                .build();
        System.out.println(coffee);
        System.out.println(coffee.getIngredients());
    }
}
