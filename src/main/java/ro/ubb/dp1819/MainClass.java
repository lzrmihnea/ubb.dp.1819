package ro.ubb.dp1819;

import ro.ubb.dp1819.exercises.ICoffeeFactory;
import ro.ubb.dp1819.exercises.builder.CoffeeBuilder;
import ro.ubb.dp1819.exercises.entity.Coffee;
import ro.ubb.dp1819.exercises.entity.Ingredient;
import ro.ubb.dp1819.exercises.service.CoffeeFactoryImpl;
import ro.ubb.dp1819.exercises.service.InterpretIngredientsService;
import ro.ubb.dp1819.exercises.service.FileReaderService;

import java.util.List;

public class MainClass {
    public static void main(String args[]){
        //encapsulation
        System.out.println("Lines in file: ");
        List<String> ingredientStrings;
        ingredientStrings = FileReaderService.readAllLines("ingredients");
        for (String ingredientString : ingredientStrings)
            System.out.println(ingredientString);

        System.out.println();
        System.out.println("Ingredients in file: ");
        List<Ingredient> ingredients = InterpretIngredientsService.interpretAsIngredients(ingredientStrings);
        for (Ingredient ingredient : ingredients)
            System.out.println(ingredient.toString());

        //factory
        ICoffeeFactory factory = new CoffeeFactoryImpl();
        Coffee coffee = factory.createCoffee(ingredients);
        System.out.println(coffee);

        //builder
        CoffeeBuilder coffeeBuilder = new CoffeeBuilder();
        for (Ingredient ingredient : ingredients)
            coffeeBuilder = coffeeBuilder.ingredient(ingredient);
        Coffee the_coffee = coffeeBuilder.build();
        System.out.println();
        for (Ingredient ingredient : the_coffee.getAll())
            System.out.println(ingredient.toString());
    }
}
