package ro.ubb.dp1819.lab1.alonso.lucia.ex12;

import ro.ubb.dp1819.lab1.alonso.lucia.ex12.entity.Drinkable;
import ro.ubb.dp1819.lab1.alonso.lucia.ex11.Ingredient;

public interface AbstractCoffeeFactory {
    Drinkable createCoffee(Ingredient Ingredient[]);
}
