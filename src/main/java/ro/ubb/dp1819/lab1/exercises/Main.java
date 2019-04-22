package ro.ubb.dp1819.lab1.exercises;

import ro.ubb.dp1819.lab1.exercises.entity.Coffee;
import ro.ubb.dp1819.lab1.exercises.entity.Ingredient;
import ro.ubb.dp1819.lab1.exercises.factory.CoffeeFactory;
import ro.ubb.dp1819.lab1.exercises.service.InterpretService;
import ro.ubb.dp1819.lab1.exercises.service.ReadService;

import java.util.List;

import static ro.ubb.dp1819.lab1.exercises.utils.Constants.PROJECT_DIRECTORY;
import static ro.ubb.dp1819.lab1.exercises.utils.Constants.SEPARATOR;

public class Main {

    private static CoffeeFactory coffeeFactory = new CoffeeFactory();

    private static String getFilesPath() {
        return PROJECT_DIRECTORY + SEPARATOR + "src" + SEPARATOR + "main" + SEPARATOR + "java" + SEPARATOR + "ro"
                + SEPARATOR + "ubb" + SEPARATOR + "dp1819" + SEPARATOR + "lab1" + SEPARATOR + "exercises"
                + SEPARATOR + "files" + SEPARATOR;
    }

    public static void main(String[] args) {

        final String filesPath = getFilesPath();

        final List<String> americanoIngredientsStrings = ReadService.readFile(filesPath + "americano.txt");
        final List<String> cappuccinoIngredientsStrings = ReadService.readFile(filesPath + "cappuccino.txt");
        final List<String> espressoIngredientsStrings = ReadService.readFile(filesPath + "espresso.txt");
        final List<String> longBlackIngredientsStrings = ReadService.readFile(filesPath + "long_black.txt");

        final List<Ingredient> americanoIngredients = InterpretService.interpret(americanoIngredientsStrings);
        final List<Ingredient> cappuccinoIngredients = InterpretService.interpret(cappuccinoIngredientsStrings);
        final List<Ingredient> espressoIngredients = InterpretService.interpret(espressoIngredientsStrings);
        final List<Ingredient> longBlackIngredients = InterpretService.interpret(longBlackIngredientsStrings);

        final Coffee americano = coffeeFactory.brewCoffee(americanoIngredients);
        final Coffee cappuccino = coffeeFactory.brewCoffee(cappuccinoIngredients);
        final Coffee espresso = coffeeFactory.brewCoffee(espressoIngredients);
        final Coffee longBlack = coffeeFactory.brewCoffee(longBlackIngredients);

        System.out.println(americano.getClass().getTypeName());
        System.out.println(cappuccino.getClass().getTypeName());
        System.out.println(espresso.getClass().getTypeName());
        System.out.println(longBlack.getClass().getTypeName());
    }

}
