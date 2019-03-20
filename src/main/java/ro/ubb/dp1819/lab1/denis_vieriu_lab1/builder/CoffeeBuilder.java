package ro.ubb.dp1819.lab1.denis_vieriu_lab1.builder;

import ro.ubb.dp1819.lab1.denis_vieriu_lab1.entity.Ingredient;
import ro.ubb.dp1819.lab1.denis_vieriu_lab1.entity.coffee.Coffee;
import ro.ubb.dp1819.lab1.denis_vieriu_lab1.entity.coffee.CustomUserCoffee;

public class CoffeeBuilder {
    Coffee coffee = new CustomUserCoffee();

    public CoffeeBuilder addIngredients(Ingredient ingredient) {
        coffee.addCoffeeIngredient(ingredient);
        return this;
    }

    public Coffee build() {
        return coffee;
    }
}
