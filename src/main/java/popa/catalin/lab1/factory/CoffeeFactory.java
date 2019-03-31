package popa.catalin.lab1.factory;

import popa.catalin.lab1.domain.Ingredient;
import popa.catalin.lab1.domain.Coffee;

import java.util.List;

public interface CoffeeFactory {
    Coffee makeCoffee(List<Ingredient> ingredients);
}
