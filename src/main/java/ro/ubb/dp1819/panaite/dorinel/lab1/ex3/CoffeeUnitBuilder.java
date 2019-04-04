package ro.ubb.dp1819.panaite.dorinel.lab1.ex3;

public class CoffeeUnitBuilder extends CoffeeBuilder {
    CoffeeUnitBuilder(CoffeeBuilder coffeeBuilder) {
        this.coffeeIngredients = coffeeBuilder.coffeeIngredients;
        this.compoundCoffeeIngredients = coffeeBuilder.compoundCoffeeIngredients;
    }

    public CoffeeIngredientBuilder ingredient(String ingredient) {
        this.coffeeIngredients.setIngredient(ingredient);
        return new CoffeeIngredientBuilder(this);
    }
}
