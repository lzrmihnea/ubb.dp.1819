package Pb1;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try{
            FileReaderService fileReaderService = new FileReaderService("E:\\Facultate\\An3-DP\\Lab1DP\\src\\data.txt");
            List<String> coffees = fileReaderService.readFromFile();
            CoffeeService coffeeService = new CoffeeService(coffees);
            List<Ingredient> ingredients = coffeeService.coffeeInterpreter();
            for(Ingredient i:ingredients) {
                System.out.println(i.toString());
            }
        } catch (NumberFormatException e) {
            System.out.println("Error when parsing data!");
        } catch(IOException e) {
            System.out.println("File not found!");
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
