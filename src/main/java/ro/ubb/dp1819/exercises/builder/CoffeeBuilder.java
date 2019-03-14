package ro.ubb.dp1819.exercises.builder;

import ro.ubb.dp1819.exercises.entity.Coffee;
import ro.ubb.dp1819.exercises.entity.CustomCoffee;
import ro.ubb.dp1819.exercises.entity.Ingredient;

public class CoffeeBuilder {
    private Coffee coffee = new CustomCoffee();

    public CoffeeBuilder ingredient(Ingredient ingredient) {
        coffee.addIngredient(ingredient);
        return this;
    }

    public Coffee build() {
        return coffee;
    }
}