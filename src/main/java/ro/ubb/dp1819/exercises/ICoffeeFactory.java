package ro.ubb.dp1819.exercises;

import ro.ubb.dp1819.exercises.entity.Coffee;
import ro.ubb.dp1819.exercises.entity.Ingredient;

import java.util.List;

public interface ICoffeeFactory {
    Coffee createCoffee(List<Ingredient> ingredients);
}
