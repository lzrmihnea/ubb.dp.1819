package ro.ubb.dp1819.fulea.razvan.lab1.encapsulation;

import java.io.IOException;
import java.util.List;

public class EncapsulationMain {

    public static void run(){
        String filename = "src/main/java/ro/ubb/dp1819/fulea/razvan/lab1/encapsulation/coffee.txt";
        try {
            List<String> tokens = ReadService.read(filename);
            try {
                List<CoffeeIngredient> coffeeIngredientList = ParseService.parseCoffeeList(tokens);
                Coffee coffee = new Coffee(coffeeIngredientList);
                System.out.println(coffee);
            } catch (RuntimeException e){
                System.err.println(e.getMessage());
            }
        } catch (IOException e) {
            System.err.println("Could not read file: " + e.getMessage());
        }
    }

}