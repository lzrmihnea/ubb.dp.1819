package ro.ubb.dp1819.lab1.macarie_cristian.cluj.factory;

import ro.ubb.cluj.domain.Coffee;
import ro.ubb.cluj.domain.Ingredient;

import java.util.List;
import java.util.Optional;

public interface Factory {
    Optional<Coffee> prepareCoffee(List<Ingredient> ingredients);
}
