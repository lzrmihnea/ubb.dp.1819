package ro.ubb.dp1819.micu.emerson.factory;

import ro.ubb.dp1819.micu.emerson.domain.Ingredient;
import ro.ubb.dp1819.micu.emerson.domain.coffee.*;

import java.util.Arrays;
import java.util.List;

public class EmyCoffeeFactory implements CoffeeFactory{

    @Override
    public Coffee createCoffee(List<Ingredient> ingredients) {

        if(CoffeeType.AMERICANO.sameIngredients(ingredients))
            return new Americano();
        else if(CoffeeType.CAPUCCINO.sameIngredients(ingredients)){
            return new Cappuccino();
        }
        else if(CoffeeType.ESPRESSO.sameIngredients(ingredients)){
            return new Expresso();
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

        public boolean sameIngredients(List<Ingredient> ingredients){
            return this.ingredients.containsAll(ingredients);
        }
    }
}
