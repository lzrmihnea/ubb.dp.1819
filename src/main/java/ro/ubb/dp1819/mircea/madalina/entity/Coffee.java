package ro.ubb.dp1819.mircea.madalina.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Madalina Mircea on 3/12/2019.
 */
public class Coffee implements ICoffee {
    protected List<Ingredient> ingredients = new ArrayList<Ingredient>();

    public Coffee()
    {

    }

    public Coffee(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String displayCoffee() {
        StringBuilder result = new StringBuilder("This coffee contains:");
        for(Ingredient i : ingredients)
            result.append("\n\t" + i.toString());
        return result.toString();
    }
}