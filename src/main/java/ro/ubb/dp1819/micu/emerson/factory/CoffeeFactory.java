package ro.ubb.dp1819.micu.emerson.factory;

import ro.ubb.dp1819.micu.emerson.domain.Ingredient;
import ro.ubb.dp1819.micu.emerson.domain.coffee.Coffee;

import java.util.List;

public interface CoffeeFactory {
    Coffee createCoffee(List<Ingredient> ingredients);
}
