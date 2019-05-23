import encapsulation.FileReaderService;
import encapsulation.Ingredient;
import encapsulation.IngredientInterpreterService;
import factory.Coffee;
import factory.CoffeeFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args){
        //1.1
        FileReaderService fs = new FileReaderService("ingredients.txt");
        IngredientInterpreterService is = new IngredientInterpreterService();

        List<String> lines = fs.getIngredients();
        for(String line : lines){
            boolean isValid = is.validateIngredient(line);
            Ingredient ing = is.createIngredient(line);
            System.out.println(ing.getIngredient() + isValid);
        }

        Ingredient i1 = new Ingredient(2, "cups", "water");
        Ingredient i2 = new Ingredient(0.25, "cups", "coffee-beans", "roasted");
        Ingredient i3 = new Ingredient(100, "ml", "milk", "foamed");

        //1.2
        Coffee co = CoffeeFactory.getCoffee(Arrays.asList(i1, i2, i3));
        System.out.println("Factory made one: " + co);

        FileReaderService fr2 = new FileReaderService("surpriseCoffee.txt");
        List<String> lines2 = fr2.getIngredients();
        List<Ingredient> ingredients2 = new ArrayList<>();
        for(String line : lines2){
            ingredients2.add(is.createIngredient(line));
        }
        Coffee co2 = CoffeeFactory.getCoffee(ingredients2);
        System.out.println("Factory also made: "+co2);
        System.out.println(co2.getIngredients());
    }
}
