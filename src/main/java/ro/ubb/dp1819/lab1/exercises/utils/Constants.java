package ro.ubb.dp1819.lab1.exercises.utils;

import ro.ubb.dp1819.lab1.exercises.entity.Ingredient;

public final class Constants {

    // System variables
    public static final String SEPARATOR = System.getProperty("file.separator");
    public static final String PROJECT_DIRECTORY = System.getProperty("user.dir");

    // Ingredient names
    public static final String WATER = "water";
    public static final String COFFEE_BEANS = "coffee-beans";
    public static final String MILK = "milk";

    // Ingredients
    public static final Ingredient TWO_CUPS_WATER = Ingredient.builder()
            .quantity(2)
            .unit("cups")
            .name("water")
            .build();

    public static final Ingredient FOUR_CUPS_WATER = Ingredient.builder()
            .quantity(4)
            .unit("cups")
            .name("water")
            .build();

    public static final Ingredient QUARTER_CUPS_COFFEE_BEANS_ROASTED = Ingredient.builder()
            .quantity(0.25)
            .unit("cups")
            .adjective("roasted")
            .name("coffee-beans")
            .build();

    public static final Ingredient HALF_CUPS_COFFEE_BEANS_ROASTED = Ingredient.builder()
            .quantity(0.5)
            .unit("cups")
            .adjective("roasted")
            .name("coffee-beans")
            .build();

    public static final Ingredient HUNDRED_ML_MILK_FOAMED = Ingredient.builder()
            .quantity(100)
            .unit("ml")
            .adjective("foamed")
            .name("milk")
            .build();

}
