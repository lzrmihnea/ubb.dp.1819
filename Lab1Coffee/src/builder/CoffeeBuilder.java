package builder;

import encapsulation.Ingredient;
import factory.*;

import java.util.List;

public class CoffeeBuilder {
    private String name;
    private List<Ingredient> ingredients;

    public CoffeeBuilder name(String name) {
        this.name = name;
        return this;
    }

    public CoffeeBuilder withIngradients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
        return this;
    }

    public Coffee build() {
        switch(name) {
            case "Espresso":
                return new Espresso(name, ingredients);
            case "Cappuccino":
                return new Cappuccino(name, ingredients);
            case "Americano":
                return new Americano(name, ingredients);
            case "Irish":
                return new Irish(name, ingredients);
        }

        return null;
    }
}
