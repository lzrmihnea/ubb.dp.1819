package ro.ubb.dp1819.mircea.madalina;

import ro.ubb.dp1819.mircea.madalina.entity.ICoffee;
import ro.ubb.dp1819.mircea.madalina.entity.Ingredient;

import java.util.List;

/**
 * Created by Madalina Mircea on 3/12/2019.
 */
public class AppMain {
    public static void appMain()
    {


        //Factory

        System.out.println("Factory:");

        ReadFileService service = new ReadFileService();
//		service.readFile("E:\\Design Patterns\\ubb.dp.1819\\src\\main\\java\\ro\\ubb\\dp1819\\mircea\\madalina\\coffee.in")
//				.stream()
//				.forEach(System.out::println);



        //Read a file and return a list of the lines
        List<String> lines = service.readFile("E:\\Design Patterns\\ubb.dp.1819\\src\\main\\java\\ro\\ubb\\dp1819\\mircea\\madalina\\coffee.in");

        System.out.println();

        InterpretIngredientsService interpretService = new InterpretIngredientsService();
//		interpretService.interpretIngredients(lines)
//				.stream()
//				.forEach(System.out::println);



        //Interpret the lines as ingredients
        List<Ingredient> ingredients = interpretService.interpretIngredients(lines);



        //Create the coffee with those ingredients
        CoffeeFactory factory = new StarbucksCoffeeFactory();

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




        //Builder

        System.out.println("\nBuilder:");

        CoffeeBuilder coffeeBuilder = new CoffeeBuilder();
        ICoffee builtCoffee = coffeeBuilder.addIngredient(new Ingredient("water", 200, "ml", "boiled"))
                .addIngredient(new Ingredient("instant-coffee", 1, "tsp"))
                .addIngredient(new Ingredient("sugar", 1, "tsp"))
                .build();

        System.out.println(builtCoffee.displayCoffee());
    }
}