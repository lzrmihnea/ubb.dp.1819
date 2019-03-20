package ro.ubb.dp1819.lab1.exercises;

import ro.ubb.dp1819.lab1.exercises.entity.Ingredient;
import ro.ubb.dp1819.lab1.exercises.services.CoffeeService;
import ro.ubb.dp1819.lab1.exercises.services.StringService;

import java.util.List;

public class MainEx1 {
    public static void main(String[] args) {
        StringService ss = new StringService();
        CoffeeService coffeeService = new CoffeeService();
        try {
            List<String> words = ss.readFromFile("D:\\Users\\labs\\design patterns\\ubb.dp.1819\\src\\main\\java\\ro\\ubb\\dp1819\\lab1\\exercises\\strings.txt");
            System.out.println(words);
            List<Ingredient> lines = coffeeService.getIngredientsFromList(words);
            System.out.println(lines);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
