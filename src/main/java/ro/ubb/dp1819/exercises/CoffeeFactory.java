package ro.ubb.dp1819.exercises;

import ro.ubb.dp1819.exercises.entity.Drinkable;
import ro.ubb.dp1819.luca.alex.ex1_1.CoffeeException;

import java.util.List;

public interface CoffeeFactory {
    Drinkable prepareCoffee(List<String> ingredients) throws CoffeeException;
}
