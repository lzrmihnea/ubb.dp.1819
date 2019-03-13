package ro.ubb.dp1819.micu.emerson;

import ro.ubb.dp1819.micu.emerson.builder.CoffeeBuilder;
import ro.ubb.dp1819.micu.emerson.domain.Ingredient;
import ro.ubb.dp1819.micu.emerson.domain.coffee.Americano;
import ro.ubb.dp1819.micu.emerson.domain.coffee.Coffee;
import ro.ubb.dp1819.micu.emerson.domain.coffee.Expresso;
import ro.ubb.dp1819.micu.emerson.factory.CoffeeFactory;
import ro.ubb.dp1819.micu.emerson.factory.EmyCoffeeFactory;
import ro.ubb.dp1819.micu.emerson.services.FileReaderService;
import ro.ubb.dp1819.micu.emerson.services.IngredientService;

import java.io.File;
import java.util.List;

public class Main {
    public static void main(String args[]){

        //1.1
        FileReaderService fileReaderService = new FileReaderService();
        List<String> stringIngredients = fileReaderService.readFile(new File("cappuccino.txt").getAbsolutePath());

        for(String string : stringIngredients){
            System.out.println(string);
        }

        IngredientService ingredientService = new IngredientService();
        List<Ingredient> ingredients = ingredientService.convertStringsToIngredients(stringIngredients);

        for(Ingredient ingredient : ingredients){
            System.out.println(ingredient);
        }

        //1.2
        CoffeeFactory factory = new EmyCoffeeFactory();
        Coffee coffee = factory.createCoffee(ingredients);
        System.out.println(coffee);

        //1.3
        CoffeeBuilder builder = new CoffeeBuilder();
        coffee = builder.addIngredient(new Ingredient(1f, "a", "b", "c"))
                .addIngredient(new Ingredient(2f, "d", "e"))
                .build();
        System.out.println(coffee);
    }
}
