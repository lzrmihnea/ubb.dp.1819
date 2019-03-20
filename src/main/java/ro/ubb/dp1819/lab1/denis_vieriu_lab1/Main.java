package ro.ubb.dp1819.lab1.denis_vieriu_lab1;

import ro.ubb.dp1819.lab1.denis_vieriu_lab1.builder.CoffeeBuilder;
import ro.ubb.dp1819.lab1.denis_vieriu_lab1.entity.coffee.Coffee;
import ro.ubb.dp1819.lab1.denis_vieriu_lab1.factory.CoffeFactoryImpl;
import ro.ubb.dp1819.lab1.denis_vieriu_lab1.factory.CoffeeFactory;
import ro.ubb.dp1819.lab1.denis_vieriu_lab1.service.ServiceCoffeFileReader;
import ro.ubb.dp1819.lab1.denis_vieriu_lab1.service.ServiceCoffeStringInterpreter;
import ro.ubb.dp1819.lab1.denis_vieriu_lab1.entity.Ingredient;

import java.util.List;

public class Main {
    static final String ingredientsPath = "src\\main\\java\\ro\\ubb\\dp1819\\lab1\\denis_vieriu_lab1\\ingredients.txt";

    public static void main(String[] args) {

        System.out.println("1.1 [Service] Reading ingredients from file as strings");
        ServiceCoffeFileReader serviceCoffeFileReader = new ServiceCoffeFileReader(ingredientsPath);
        List<String> ingredientsAsStrings = serviceCoffeFileReader.readFileIngredientsAsStrings();
        System.out.println(ingredientsAsStrings);

        System.out.println("1.1 [Service] Parsing input strings");
        ServiceCoffeStringInterpreter serviceCoffeStringInterpreter = new ServiceCoffeStringInterpreter(ingredientsAsStrings);
        List<Ingredient> ingredients = serviceCoffeStringInterpreter.convertStringToIngredients();
        System.out.println(ingredients);

        System.out.println("1.2 [CoffeFactory] Creating coffee from ingredients");
        CoffeeFactory coffeeFactory = new CoffeFactoryImpl();
        Coffee coffee = coffeeFactory.coffee(ingredients);
        System.out.println(coffee);

        System.out.println("!.3 [CoffeBuilder] Create custom coffee");
        CoffeeBuilder coffeeBuilder = new CoffeeBuilder();
        Coffee customCoffee = coffeeBuilder.addIngredients(new Ingredient(5f, "ml", "water"))
                .addIngredients(new Ingredient(5f, "ml", "water"))
                .build();

        System.out.println(customCoffee);

    }
}
