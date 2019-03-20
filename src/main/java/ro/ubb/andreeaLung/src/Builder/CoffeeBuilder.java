package Builder;

import Factory.Coffee;
import Factory.CoffeeFactory;
import Factory.CoffeeFactoryImpl;
import Factory.CoffeeIngredientsInterpreterException;
import SOLID.Ingredient;

import java.util.ArrayList;
import java.util.List;

public class CoffeeBuilder {
    private final CoffeeFactory coffeeFactory = new CoffeeFactoryImpl();
    private List<Ingredient> ingredients;

    public CoffeeBuilder() {
        this.ingredients = new ArrayList<>();
    }

    public CoffeeBuilder(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public CoffeeBuilder addIngredient(Ingredient ingredient) {
        this.ingredients.add(ingredient);
        return this;
    }

    public Coffee build() {
        try {
            return this.coffeeFactory.getCoffee(this.ingredients);
        } catch (CoffeeIngredientsInterpreterException e) {
            e.printStackTrace();
        }
        return null;
    }


}
