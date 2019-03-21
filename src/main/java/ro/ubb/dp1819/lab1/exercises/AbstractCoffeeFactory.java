package ro.ubb.dp1819.lab1.exercises;

import org.springframework.stereotype.Component;
import ro.ubb.dp1819.lab1.exercises.entity.Drinkable;
import ro.ubb.dp1819.lab1.exercises.entity.Ingredient;

import java.util.List;

@Component
public interface AbstractCoffeeFactory {
    Drinkable makeCoffee(List<Ingredient> ingredients);
}
