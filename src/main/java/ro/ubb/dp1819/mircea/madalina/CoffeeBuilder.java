package ro.ubb.dp1819.mircea.madalina;

import ro.ubb.dp1819.mircea.madalina.entity.Coffee;
import ro.ubb.dp1819.mircea.madalina.entity.Ingredient;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Madalina Mircea on 3/12/2019.
 */
public class CoffeeBuilder {
    List<Ingredient> ingredients = new ArrayList<>();

    public CoffeeBuilder addIngredient(Ingredient i)
    {
        ingredients.add(i);
        return this;
    }

    public Coffee build()
    {
        Coffee coffee = new Coffee(ingredients);
        return coffee;
    }
}