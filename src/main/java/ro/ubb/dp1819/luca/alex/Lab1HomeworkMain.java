package ro.ubb.dp1819.luca.alex;

import ro.ubb.dp1819.exercises.CoffeeFactory;
import ro.ubb.dp1819.exercises.LucaCoffeeFactory;
import ro.ubb.dp1819.exercises.entity.Drinkable;
import ro.ubb.dp1819.luca.alex.ex1_1.BasicFileReaderService;
import ro.ubb.dp1819.luca.alex.ex1_1.CoffeeException;
import ro.ubb.dp1819.luca.alex.ex1_1.FileReaderService;
import ro.ubb.dp1819.luca.alex.ex1_1.IngredientsFileReaderService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Lab1HomeworkMain {

    private static CoffeeFactory coffeeFactory = new LucaCoffeeFactory();

    public static void main(String[] args) {
        // String filename = "espressoInput.txt";
        // String filename = "cappuccinoInput.txt";
         String filename = "americanoInput.txt";
        // String filename = "latteInput.txt";

        FileReaderService fileReaderService = new BasicFileReaderService();
        IngredientsFileReaderService fileReaderService1 = new IngredientsFileReaderService();
        List<String> lines = new ArrayList<>();
        try {
            // lines = fileReaderService.readFromFile(filename);
            lines = fileReaderService1.readFromFile(filename);
            Drinkable coffee = coffeeFactory.prepareCoffee(lines);
            System.out.println(coffee.taste());
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        } catch (CoffeeException e) {
            e.printStackTrace();
        }
    }
}
