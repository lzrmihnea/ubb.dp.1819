package ro.ubb.dp1819.mircea.madalina;

import ro.ubb.dp1819.mircea.madalina.entity.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Madalina Mircea on 3/12/2019.
 */
public class StarbucksCoffeeFactory implements CoffeeFactory {
    public StarbucksCoffeeFactory() {
        recipes.put("espresso", Arrays.asList(new Ingredient("water", 2, "cups"),
                new Ingredient("coffee-beans", 0.25, "cups", "roasted")));

        recipes.put("cappuccino", Arrays.asList(new Ingredient("water", 2, "cups"),
                new Ingredient("coffee-beans", 0.25, "cups", "roasted"),
                new Ingredient("milk", 100, "ml", "foamed")));

        recipes.put("americano", Arrays.asList(new Ingredient("water", 4, "cups"),
                new Ingredient("coffee-beans", 0.25, "cups", "roasted")));

        recipes.put("frappe", Arrays.asList(new Ingredient("water", 0.25, "cups"),
                new Ingredient("instant-coffee", 1, "tsp"),
                new Ingredient("milk", 1, "cups", "fat-free"),
                new Ingredient("chocolate-syrup", 4, "tsp"),
                new Ingredient("ice", 0.5, "cups", "crushed")));
    }

    @Override
    public ICoffee createCoffee(List<Ingredient> ingredients) throws Exception {
        List<String> possibleCoffees = new ArrayList<>();
        recipes.keySet().stream().forEach(k -> possibleCoffees.add(k));

        for(Ingredient ingredient : ingredients)
        {
            for(String coffee : recipes.keySet())
            {
                if(possibleCoffees.contains(coffee))
                {
                    if(recipes.get(coffee).size() != ingredients.size())
                    {
                        possibleCoffees.remove(coffee);
                    }
                    else {
                        boolean found = false;

                        for (Ingredient recipeIngredient : recipes.get(coffee)) {
                            if (recipeIngredient.equals(ingredient)) {
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            possibleCoffees.remove(coffee);
                        }
                    }
                }
            }
        }

        if(possibleCoffees.size() != 1)
            throw new Exception("Coffee not found.");

        if(possibleCoffees.get(0).toLowerCase() == "espresso")
            return new Espresso();
        else if(possibleCoffees.get(0).toLowerCase() == "cappuccino")
            return new Cappuccino();
        else if(possibleCoffees.get(0).toLowerCase() == "americano")
            return new Americano();
        else if(possibleCoffees.get(0).toLowerCase() == "frappe")
        {
            return new Frappe();
        }
        else
            throw new Exception("Coffee not found.");
    }
}