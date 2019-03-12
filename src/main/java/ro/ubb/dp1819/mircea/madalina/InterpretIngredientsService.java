package ro.ubb.dp1819.mircea.madalina;

import ro.ubb.dp1819.mircea.madalina.entity.Ingredient;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Madalina Mircea on 3/12/2019.
 */
public class InterpretIngredientsService {
    public List<Ingredient> interpretIngredients(List<String> ingredients)
    {
        List<Ingredient> result = new ArrayList<>();

        try
        {
            for(String s : ingredients)
            {
                String[] words = s.split(" ");

                double quantity = 0;

                try
                {
                    quantity = Double.parseDouble(words[0]);

                    if(words.length == 3)
                    {
                        Ingredient i = new Ingredient(words[2].toLowerCase(), quantity, words[1].toLowerCase());
                        result.add(i);
                    }
                    else if(words.length == 4)
                    {
                        Ingredient i = new Ingredient(words[2].toLowerCase(), quantity, words[1].toLowerCase(), words[3].toLowerCase());
                        result.add(i);
                    }
                    else
                    {
                        throw new Exception("Invalid ingredient.");
                    }
                }
                catch(Exception e)
                {
                    throw new Exception("Invalid number.");
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            result.clear();
        }

        return result;
    }
}