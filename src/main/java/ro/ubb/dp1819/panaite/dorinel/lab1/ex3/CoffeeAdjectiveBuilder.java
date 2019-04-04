package ro.ubb.dp1819.panaite.dorinel.lab1.ex3;

public class CoffeeAdjectiveBuilder extends CoffeeFinalBuilder {
    CoffeeAdjectiveBuilder(CoffeeBuilder coffeeBuilder) {
        super(coffeeBuilder);
        this.coffeeIngredients = coffeeBuilder.coffeeIngredients;
        this.compoundCoffeeIngredients = coffeeBuilder.compoundCoffeeIngredients;
    }
}
