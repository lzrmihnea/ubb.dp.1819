package ro.ubb.dp1819.lab1.exercises;

import ro.ubb.dp1819.lab1.exercises.entity.Drinkable;
import ro.ubb.dp1819.lab1.exercises.entity.Ingredient;
import ro.ubb.dp1819.lab1.exercises.service.FileReaderService;
import ro.ubb.dp1819.lab1.exercises.service.IngredientParserService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //print cwd
        System.out.println(System.getProperty("user.dir"));

        //read from each file the correct ingredients and tag them accordingly
        List<String> rowWaterIngredients = FileReaderService.getLines("water.in");
        List<Ingredient> waterIngredients = IngredientParserService.parseIngredients(rowWaterIngredients);

        List<String> rawLatteIngredients = FileReaderService.getLines("latte.in");
        List<Ingredient> latteIngredients = IngredientParserService.parseIngredients(rawLatteIngredients);

        List<String> rawEspressoIngredients = FileReaderService.getLines("espresso.in");
        List<Ingredient> espressoIngredients = IngredientParserService.parseIngredients(rawEspressoIngredients);

        List<String> rawCappuccinoIngredients = FileReaderService.getLines("cappuccino.in");
        List<Ingredient> cappuccinoIngredients = IngredientParserService.parseIngredients(rawCappuccinoIngredients);

        //create a coffee factory
        AbstractCoffeeFactory coffeeFactory = new CoffeeFactory();

        //create a list in which you store all drinkable
        List<Drinkable> drinks = new ArrayList<>();
        drinks.add(coffeeFactory.makeCoffee(waterIngredients));
        drinks.add(coffeeFactory.makeCoffee(latteIngredients));
        drinks.add(coffeeFactory.makeCoffee(espressoIngredients));
        drinks.add(coffeeFactory.makeCoffee(cappuccinoIngredients));

        //show on the screen the drinkable
        System.out.println("========================================================");
        System.out.println(drinks);
        System.out.println("========================================================");
    }
}
