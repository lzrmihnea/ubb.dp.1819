package ro.ubb.dp1819.todoran.corina.lab1.factory.coffes;

import ro.ubb.dp1819.todoran.corina.lab1.model.Ingredient;

import java.util.ArrayList;
import java.util.List;

public class Coffee implements ICoffee {
    private List<Ingredient> ingredients = new ArrayList<>();

    public Coffee() {}

    public Coffee(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String displayCoffee() {
        StringBuilder result = new StringBuilder("This coffee contains:");
        for(Ingredient i : ingredients)
            result.append("\n\t").append(i.toString());
        return result.toString();
    }
}
