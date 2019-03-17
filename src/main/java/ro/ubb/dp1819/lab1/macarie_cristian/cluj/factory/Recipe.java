package ro.ubb.dp1819.lab1.macarie_cristian.cluj.factory;

import ro.ubb.cluj.domain.Ingredient;

import java.util.Arrays;
import java.util.List;

public enum Recipe {
    ESPRESSO(Arrays.asList(
            Ingredient.builder()
                    .quantity(2D)
                    .unit("cups")
                    .name("water")
                    .build(),
            Ingredient.builder()
                    .quantity(0.25D)
                    .unit("cups")
                    .name("coffee-beans")
                    .adjective("roasted")
                    .build()
    )),
    CAPPUCCINO(Arrays.asList(
            Ingredient.builder()
                    .quantity(2D)
                    .unit("cups")
                    .name("water")
                    .build(),
            Ingredient.builder()
                    .quantity(0.25D)
                    .unit("cups")
                    .name("coffee-beans")
                    .adjective("roasted")
                    .build(),
            Ingredient.builder()
                    .quantity(100D)
                    .unit("ml")
                    .name("milk")
                    .adjective("foamed")
                    .build(),
            Ingredient.builder()
                    .quantity(0.2D)
                    .unit("tablets")
                    .name("chocolate")
                    .adjective("black")
                    .build()
    )),
    CHOCOLATO(Arrays.asList(
            Ingredient.builder()
                    .quantity(2D)
                    .unit("cups")
                    .name("water")
                    .build(),
            Ingredient.builder()
                    .quantity(0.25D)
                    .unit("cups")
                    .name("coffee-beans")
                    .adjective("roasted")
                    .build(),
            Ingredient.builder()
                    .quantity(0.2D)
                    .unit("tablets")
                    .name("chocolate")
                    .adjective("black")
                    .build()
    )),
    LATTE(Arrays.asList(
            Ingredient.builder()
                    .quantity(4D)
                    .unit("cups")
                    .name("water")
                    .build(),
            Ingredient.builder()
                    .quantity(0.25D)
                    .unit("cups")
                    .name("coffee-beans")
                    .adjective("roasted")
                    .build(),
            Ingredient.builder()
                    .quantity(100D)
                    .unit("ml")
                    .name("milk")
                    .adjective("foamed")
                    .build()
    ));

    private List<Ingredient> ingredients;

    Recipe(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public boolean isEqual(List<Ingredient> ingredients) {
        return ingredients.equals(this.ingredients);
    }
}
