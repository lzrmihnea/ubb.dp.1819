package services;

import exceptions.CoffeeException;
import model.ingredient.Ingredient;

import java.io.FileNotFoundException;
import java.util.List;

public interface IngredientService {
	List<Ingredient> readIngredients(String filename) throws FileNotFoundException, CoffeeException;
}
