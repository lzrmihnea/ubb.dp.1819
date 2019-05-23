package Pb2;

import Pb1.CoffeeService;
import Pb1.FileReaderService;
import Pb1.Ingredient;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            FileReaderService fileReaderService1 = new FileReaderService("E:\\Facultate\\An3-DP\\Lab1DP\\src\\coffee1.txt");
            FileReaderService fileReaderService2 = new FileReaderService("E:\\Facultate\\An3-DP\\Lab1DP\\src\\coffee2.txt");
            FileReaderService fileReaderService3 = new FileReaderService("E:\\Facultate\\An3-DP\\Lab1DP\\src\\coffee3.txt");
            FileReaderService fileReaderService4 = new FileReaderService("E:\\Facultate\\An3-DP\\Lab1DP\\src\\coffee4.txt");

            List<String> coffee1 = fileReaderService1.readFromFile();
            List<String> coffee2 = fileReaderService2.readFromFile();
            List<String> coffee3 = fileReaderService3.readFromFile();
            List<String> coffee4 = fileReaderService4.readFromFile();

            CoffeeService coffeeService1 = new CoffeeService(coffee1);
            CoffeeService coffeeService2 = new CoffeeService(coffee2);
            CoffeeService coffeeService3 = new CoffeeService(coffee3);
            CoffeeService coffeeService4 = new CoffeeService(coffee4);

            List<Ingredient> ingredients1 = coffeeService1.coffeeInterpreter();
            List<Ingredient> ingredients2 = coffeeService2.coffeeInterpreter();
            List<Ingredient> ingredients3 = coffeeService3.coffeeInterpreter();
            List<Ingredient> ingredients4 = coffeeService4.coffeeInterpreter();

            System.out.println(CoffeeFactory.getCoffee(ingredients1).toString());
            System.out.println(CoffeeFactory.getCoffee(ingredients2).toString());
            System.out.println(CoffeeFactory.getCoffee(ingredients3).toString());
            System.out.println(CoffeeFactory.getCoffee(ingredients4).toString());
        } catch (NumberFormatException e) {
            System.out.println("Error when parsing data!");
        } catch(IOException e) {
            System.out.println("File not found!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
