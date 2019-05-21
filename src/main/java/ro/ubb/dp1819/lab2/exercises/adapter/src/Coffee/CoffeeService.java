package Coffee;

import Utils.IExecutingService;
import Utils.ReadingService;

import java.util.ArrayList;
import java.util.List;

public class CoffeeService implements IExecutingService {

    private ReadingService readingService;
    private List<Coffee> coffees;

    public CoffeeService() {
        this.readingService = new ReadingService("D:\\ubb\\A3S2\\Design Patterns\\Lab2\\adapter\\src\\Coffee\\ingredients.txt");
        this.coffees = new ArrayList<>();
    }

    public void makeCoffee() {
        List<String> lines = readingService.readIngredients();
        for (int i = 0; i < lines.size() - 1; i++) {
            String[] ingredients = lines.get(i).split(" ");
            if (ingredients.length == 3)
                coffees.add(new Coffee(ingredients[0], ingredients[1], ingredients[2]));
            else if (ingredients.length == 4)
                coffees.add(new Coffee(ingredients[0], ingredients[1], ingredients[2], ingredients[3]));
        }
    }

    public void printCoffees(){
        for(Coffee c: coffees)
            System.out.println(c);
    }
}
