package ro.ubb.dp1819.todoran.corina.lab1;

import ro.ubb.dp1819.todoran.corina.lab1.builder.CoffeeBuilder;
import ro.ubb.dp1819.todoran.corina.lab1.model.Ingredient;
import ro.ubb.dp1819.todoran.corina.lab1.encapsulation.CoffeeInterpreter;
import ro.ubb.dp1819.todoran.corina.lab1.encapsulation.ReadFileService;
import ro.ubb.dp1819.todoran.corina.lab1.factory.CoffeeException;
import ro.ubb.dp1819.todoran.corina.lab1.factory.CoffeeFactory;
import ro.ubb.dp1819.todoran.corina.lab1.factory.ICoffeeFactory;
import ro.ubb.dp1819.todoran.corina.lab1.factory.coffes.ICoffee;

import java.io.File;
import java.util.List;

public class Lab1Main {
    public static void main(String[] args) {
        // 1.1
        File file = new File("src\\main\\java\\ro\\ubb\\dp1819\\todoran.corina\\lab1\\model\\ingredients_encapsulation.txt");
        ReadFileService reader = new ReadFileService();
        CoffeeInterpreter interpret = new CoffeeInterpreter();
        List<Ingredient> ingredients = interpret.interpretIngredients(reader.readFile(file));
        ingredients.forEach(System.out::println);

        System.out.println("\n");

        // 1.2
        ICoffeeFactory factory = new CoffeeFactory();

        try
        {
            ICoffee coffee = factory.createCoffee(ingredients);
            System.out.println(coffee.displayCoffee());
        }
        catch(Exception e)
        {
            //Print error message on exception
            System.out.println(e.getMessage());
        }

        System.out.println("\n");

        // 1.3
        CoffeeBuilder coffeeBuilder = new CoffeeBuilder();
        ICoffee builtCoffee;
        try {
            builtCoffee = coffeeBuilder.addIngredient(new Ingredient("whiskey", 500, "ml"))
                    .addIngredient(new Ingredient("milk", 500, "g", "condensed"))
                    .addIngredient(new Ingredient("instant-coffee", 1, "cups"))
                    .addIngredient(new Ingredient("vanilla", 1, "tsp", "essence"))
                    .addIngredient(new Ingredient("whipped-cream", 250, "ml", "fresh"))
                    .addIngredient(new Ingredient("chocolate-syrup", 2, "tsp"))
                    .build();
            System.out.println(builtCoffee.displayCoffee());

            System.out.println("\n");

            System.out.println(new CoffeeBuilder().build().displayCoffee());
        } catch (CoffeeException e) {
            System.out.println(e.getMessage());
        }

    }
}
