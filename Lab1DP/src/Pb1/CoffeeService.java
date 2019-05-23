package Pb1;

import java.util.ArrayList;
import java.util.List;

public class CoffeeService {
    private List<String> coffeeIngredients;

    public CoffeeService(List<String> coffeeIngredients) {
        this.coffeeIngredients = coffeeIngredients;
    }

    public List<Ingredient> coffeeInterpreter() {
        List<Ingredient> ingredients = new ArrayList<>();
        for(String str:coffeeIngredients) {
            String[] list = str.split(" ");
            if (list.length == 3) {
                ingredients.add(new Ingredient(list[2], Double.parseDouble(list[0]),list[1]));
            } else if (list.length == 4) {
                ingredients.add(new Ingredient(list[2], Double.parseDouble(list[0]),list[1], list[3]));
            }
        }

        return ingredients;
    }
}
