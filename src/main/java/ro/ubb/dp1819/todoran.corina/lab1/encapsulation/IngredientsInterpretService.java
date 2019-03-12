package ro.ubb.dp1819.todoran.corina.lab1.encapsulation;

import java.util.ArrayList;
import java.util.List;

public class IngredientsInterpretService {
    public List<Ingredient> interpretIngredients(List<String> fileLines) {
        List<Ingredient> ingredients = new ArrayList<>();

        fileLines.forEach(line -> {
            String[] words = line.split(" ");

            try {
                if (words.length == 3)
                    ingredients.add(new Ingredient(words[2].toLowerCase(), Double.parseDouble(words[0]), words[1].toLowerCase()));
                else if (words.length == 4)
                    ingredients.add(new Ingredient(words[2].toLowerCase(), Double.parseDouble(words[0]), words[1].toLowerCase(), words[3].toLowerCase()));
                else
                    throw new Exception("Invalid ingredient!");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                ingredients.clear();
            }
        });
        return ingredients;
    }
}
