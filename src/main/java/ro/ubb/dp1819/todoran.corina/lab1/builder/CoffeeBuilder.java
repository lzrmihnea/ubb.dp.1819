package ro.ubb.dp1819.todoran.corina.lab1.builder;

import ro.ubb.dp1819.todoran.corina.lab1.encapsulation.Ingredient;
import ro.ubb.dp1819.todoran.corina.lab1.factory.CoffeeException;
import ro.ubb.dp1819.todoran.corina.lab1.factory.coffes.Coffee;

import java.util.ArrayList;
import java.util.List;

public class CoffeeBuilder {
    private List<Ingredient> ingredients = new ArrayList<>();

    public CoffeeBuilder addIngredient(Ingredient i)
    {
        ingredients.add(i);
        return this;
    }

    public Coffee build() throws CoffeeException {
        if (ingredients.size() == 0)
            throw new CoffeeException("Please add at least one ingredient!");
        return new Coffee(ingredients);
    }
}
