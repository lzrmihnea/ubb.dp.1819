package ro.ubb.dp1819.lab1.exercises;

import ro.ubb.dp1819.lab1.exercises.entity.Drinkable;

public interface AbstractFactory {
    Drinkable makeCoffee(String ingredients);
}
