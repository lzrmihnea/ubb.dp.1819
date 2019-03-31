package popa.catalin.lab1.builder;

import popa.catalin.lab1.domain.Coffee;
import popa.catalin.lab1.domain.Ingredient;
import popa.catalin.lab1.domain.coffees.Covfefe;

public class CoffeeBuilder {
    private Coffee coffee = new Covfefe();

    public CoffeeBuilder ingredient(Ingredient ingredient) {
        coffee.addIngredient(ingredient);
        return this;
    }

    public Coffee build() {
        return coffee;
    }
}
