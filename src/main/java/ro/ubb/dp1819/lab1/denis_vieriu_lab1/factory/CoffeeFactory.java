package ro.ubb.dp1819.lab1.denis_vieriu_lab1.factory;

import ro.ubb.dp1819.lab1.denis_vieriu_lab1.entity.Ingredient;
import ro.ubb.dp1819.lab1.denis_vieriu_lab1.entity.coffee.Coffee;

import java.util.List;

public interface CoffeeFactory {
    Coffee coffee(List<Ingredient> ingredientList);
}
