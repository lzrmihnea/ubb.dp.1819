import Builder.CoffeeBuilder;
import Factory.Coffee;
import Factory.CoffeeFactory;
import Factory.CoffeeFactoryImpl;
import Factory.CoffeeIngredientsInterpreterException;
import SOLID.*;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        // ex1
        System.out.println("\nEX1\n");
        FileReadingService fileReadingService = new FileReadingServiceImpl();
        CoffeInterpreterService coffeInterpreterService = new CoffeeInterpreterServiceImpl();

        List<String> coffeeStringList = fileReadingService.readFileAsStringList("src/coffee_ingredients");
        List<Ingredient> coffeeIngredients = coffeInterpreterService.interpretCoffee(coffeeStringList);

        coffeeIngredients.forEach(System.out::println);

        // ex2
        System.out.println("\nEX2\n");
        CoffeeFactory coffeeFactory = new CoffeeFactoryImpl();
        try {
            Coffee coffee1 = coffeeFactory.getCoffee(coffeeIngredients.subList(0,2));
            Coffee coffee2 = coffeeFactory.getCoffee(coffeeIngredients.subList(2,5));
            Coffee coffee3 = coffeeFactory.getCoffee(coffeeIngredients.subList(5,7));
            Coffee coffee4 = coffeeFactory.getCoffee(coffeeIngredients.subList(7,9));

            Arrays.asList(coffee1,coffee2,coffee3,coffee4).forEach(coffee -> System.out.println(coffee.getType()));

            Coffee coffee5 = coffeeFactory.getCoffee(coffeeIngredients.subList(9,10));
        } catch (CoffeeIngredientsInterpreterException e) {
            System.out.println(e.toString());
        }

        // ex3
        System.out.println("\nEX3\n");
        CoffeeBuilder coffeeBuilder1 = new CoffeeBuilder();
        CoffeeBuilder coffeeBuilder2 = new CoffeeBuilder();
        CoffeeBuilder coffeeBuilder3 = new CoffeeBuilder();
        CoffeeBuilder coffeeBuilder4 = new CoffeeBuilder();

        Coffee coffee1 = coffeeBuilder1.addIngredient(coffeeIngredients.get(0)).addIngredient(coffeeIngredients.get(1)).build();
        Coffee coffee2 = coffeeBuilder2.addIngredient(coffeeIngredients.get(2)).addIngredient(coffeeIngredients.get(3)).addIngredient(coffeeIngredients.get(4)).build();
        Coffee coffee3 = coffeeBuilder3.addIngredient(coffeeIngredients.get(5)).addIngredient(coffeeIngredients.get(6)).build();
        Coffee coffee4 = coffeeBuilder4.addIngredient(coffeeIngredients.get(7)).addIngredient(coffeeIngredients.get(8)).build();

        Arrays.asList(coffee1,coffee2,coffee3,coffee4).forEach(coffee -> System.out.println(coffee.getType()));
    }
}
