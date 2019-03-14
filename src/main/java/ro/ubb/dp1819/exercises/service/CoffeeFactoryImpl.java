package ro.ubb.dp1819.exercises.service;

import ro.ubb.dp1819.exercises.ICoffeeFactory;
import ro.ubb.dp1819.exercises.entity.*;

import java.util.Arrays;
import java.util.List;

public class CoffeeFactoryImpl implements ICoffeeFactory{

    @Override
    public Coffee createCoffee(List<Ingredient> ingredients) {

        if(CoffeeType.AMERICANO.containsIngredients(ingredients))
            return new Americano();
        else if(CoffeeType.CAPUCCINO.containsIngredients(ingredients)){
            return new Cappuccino();
        }
        else if(CoffeeType.ESPRESSO.containsIngredients(ingredients)){
            return new Espresso();
        }
        throw new RuntimeException("There is no such a coffee with these ingredients");
    }

    private enum CoffeeType {
        ESPRESSO(Arrays.asList(new Ingredient(2.0f, "cups", "water"),
                new Ingredient(0.25f, "cups", "coffee-beans", "roasted")
        )),
        CAPUCCINO(Arrays.asList(new Ingredient(2.0f, "cups", "water"),
                new Ingredient(0.25f, "cups", "coffee-beans", "roasted"),
                new Ingredient(100.0f, "ml", "milk", "foamed"))
        ),
        AMERICANO(Arrays.asList(new Ingredient(4.0f, "cups", "water"),
                new Ingredient(0.25f, "cups", "coffee-beans", "roasted"))
        );

        private List<Ingredient> ingredients;

        CoffeeType(List<Ingredient> ingredients) {
            this.ingredients = ingredients;
        }

        public boolean containsIngredients(List<Ingredient> ingredients){
            return this.ingredients.containsAll(ingredients);
        }
    }
}