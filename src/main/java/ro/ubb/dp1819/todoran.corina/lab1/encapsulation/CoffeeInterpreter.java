package ro.ubb.dp1819.todoran.corina.lab1.encapsulation;

import ro.ubb.dp1819.todoran.corina.lab1.model.Ingredient;

import java.util.ArrayList;
import java.util.List;

public class CoffeeInterpreter implements ICoffeeInterpreter{
    public List<Ingredient> interpretIngredients(List<String> fileLines) {
        List<Ingredient> ingredients = new ArrayList<>();

        fileLines.forEach(line -> {
            String[] words = line.split(" ");

            try {
                if (words.length != 3 && words.length != 4)
                    throw new Exception("Invalid ingredient!");


                ingredients.add(
                        words.length == 4
                                ?
                                new Ingredient(words[2].toLowerCase(), Double.parseDouble(words[0]), words[1].toLowerCase(), words[3].toLowerCase())
                                :
                                new Ingredient(words[2].toLowerCase(), Double.parseDouble(words[0]), words[1].toLowerCase())
                );

            } catch (Exception e) {
                System.out.println(e.getMessage());
                ingredients.clear();
            }
        });
        return ingredients;
    }
}
