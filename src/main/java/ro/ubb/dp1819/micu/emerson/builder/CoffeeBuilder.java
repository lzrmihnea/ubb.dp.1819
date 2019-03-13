package ro.ubb.dp1819.micu.emerson.builder;

import ro.ubb.dp1819.micu.emerson.domain.Ingredient;
import ro.ubb.dp1819.micu.emerson.domain.coffee.Coffee;
import ro.ubb.dp1819.micu.emerson.domain.coffee.SpecialCoffee;


public class CoffeeBuilder {
    Coffee coffee = new SpecialCoffee();

    public CoffeeBuilder addIngredient(Ingredient ingredient)
    {
        coffee.addIngredient(ingredient);
        return this;
    }

    public Coffee build()
    {
        return coffee;
    }
}
