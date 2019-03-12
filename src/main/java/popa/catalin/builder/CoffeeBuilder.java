package popa.catalin.builder;

import popa.catalin.domain.Coffee;
import popa.catalin.domain.Ingredient;
import popa.catalin.domain.coffees.Covfefe;

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
