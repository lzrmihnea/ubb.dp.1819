package ro.ubb.dp1819.lab1.exercises.services;

import ro.ubb.dp1819.lab1.exercises.entity.AdjectiveType;
import ro.ubb.dp1819.lab1.exercises.entity.Ingredient;
import ro.ubb.dp1819.lab1.exercises.entity.IngredientType;
import ro.ubb.dp1819.lab1.exercises.entity.UnitType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoffeeService{

    public Ingredient getElementsFromLine(String line) throws Exception {
        List<String> ingredients = Arrays.asList(line.split(" "));
        Double quantity;
        if (ingredients.size()!= 3 && ingredients.size()!= 4){
            throw new Exception("Wrong number of ingredients");
        }

        UnitType unitType = Enum.valueOf(UnitType.class, ingredients.get(1));
        IngredientType ingredientType = Enum.valueOf(IngredientType.class, ingredients.get(2));

        try {
            quantity = Double.parseDouble(ingredients.get(0));
        }
        catch(Exception ex){
            throw new Exception("The list is not correct");
        }

        if (ingredients.size() == 3)
            return new Ingredient(quantity, unitType, ingredientType);
        else {
            AdjectiveType adjectiveType = Enum.valueOf(AdjectiveType.class, ingredients.get(3));
            return new Ingredient(quantity, unitType, ingredientType, adjectiveType);
        }
    }


    public List<Ingredient> getIngredientsFromList(List<String> strings) throws Exception {
        List<Ingredient> elements = new ArrayList<>();
        for (String s:strings){
            elements.add(getElementsFromLine(s));
        }
        return elements;
    }
}
