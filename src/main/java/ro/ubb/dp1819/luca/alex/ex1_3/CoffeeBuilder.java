package ro.ubb.dp1819.luca.alex.ex1_3;

import ro.ubb.dp1819.exercises.CoffeeType;
import ro.ubb.dp1819.exercises.Ingredient;
import ro.ubb.dp1819.exercises.entity.*;

public class CoffeeBuilder {
    private Drinkable coffee;

    public CoffeeBuilder(CoffeeType coffeeType) {
        switch (coffeeType) {
            case ESPRESSO:
                coffee = new Espresso();
                break;
            case CAPPUCCINO:
                coffee = new Cappuccino();
                break;
            case AMERICANO:
                coffee = new Americano();
                break;
            case LATTE:
                coffee = new Latte();
                break;
            default:
                coffee = new Espresso();
        }
    }

    public CoffeeBuilder addIngredient(Ingredient ingredient){
        coffee.getIngredients().add(ingredient);
        return this;
    }

    public Drinkable build() {
        return this.coffee;
    }
}
