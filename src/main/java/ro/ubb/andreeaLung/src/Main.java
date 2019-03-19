import SOLID.*;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        // ex1
        FileReadingService fileReadingService = new FileReadingServiceImpl();
        CoffeInterpreterService coffeInterpreterService = new CoffeeInterpreterServiceImpl();

        List<String> coffeeStringList = fileReadingService.readFileAsStringList("src/coffee_ingredients");
        List<Ingredient> coffeeIngredients = coffeInterpreterService.interpretCoffee(coffeeStringList);

        coffeeIngredients.forEach(System.out::println);

        // ex2

    }
}
