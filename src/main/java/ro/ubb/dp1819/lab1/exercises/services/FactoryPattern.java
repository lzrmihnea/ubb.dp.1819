package ro.ubb.dp1819.lab1.exercises.services;

import ro.ubb.dp1819.lab1.exercises.entity.CoffeeType;
import ro.ubb.dp1819.lab1.exercises.entity.Ingredient;
import java.util.List;

public class FactoryPattern {
    public static void main(String[] args) {
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        StringService stringService = new StringService();
        CoffeeService coffeeService = new CoffeeService();

        try {
            List<String> words = stringService.readFromFile("D:\\Users\\Maria\\labs\\design patterns\\ubb.dp.1819\\src\\main\\java\\ro\\ubb\\dp1819\\lab1\\exercises\\strings.txt");
            List<Ingredient> ingredients = coffeeService.getIngredientsFromList(words);
            System.out.println(ingredients);

            CoffeeType coffee = coffeeFactory.getCoffee(ingredients);
            System.out.println(coffee);

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}