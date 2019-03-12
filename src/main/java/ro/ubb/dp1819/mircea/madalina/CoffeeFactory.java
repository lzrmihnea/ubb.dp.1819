package ro.ubb.dp1819.mircea.madalina;

import ro.ubb.dp1819.mircea.madalina.entity.ICoffee;
import ro.ubb.dp1819.mircea.madalina.entity.Ingredient;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Madalina Mircea on 3/12/2019.
 */
public interface CoffeeFactory {
    Map<String, List<Ingredient>> recipes = new HashMap<>();

    ICoffee createCoffee(List<Ingredient> ingredients) throws Exception;
}