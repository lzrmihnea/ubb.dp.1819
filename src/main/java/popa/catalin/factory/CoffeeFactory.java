package popa.catalin.factory;

import popa.catalin.domain.Ingredient;
import popa.catalin.domain.Coffee;

import java.util.List;

public interface CoffeeFactory {
    Coffee makeCoffee(List<Ingredient> ingredients);
}
