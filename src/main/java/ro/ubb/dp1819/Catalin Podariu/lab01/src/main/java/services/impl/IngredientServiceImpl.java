package services.impl;

import exceptions.CoffeeException;
import model.ingredient.Ingredient;
import services.IOService;
import services.IngredientService;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class IngredientServiceImpl implements IngredientService {
	private static IngredientService instance = null;
	private IOService ioService = new IoServiceImpl();

	@Override
	public List<Ingredient> readIngredients(String filename) throws FileNotFoundException, CoffeeException {

		List<Ingredient> ingredients = new ArrayList<>();
		for (String s : ioService.readFile(filename)) {
			Ingredient ingredient = new Ingredient(s);
			ingredients.add(ingredient);
		}

		return ingredients;
	}

	public static IngredientService getInstance() {
		if (instance == null)
			instance = new IngredientServiceImpl();
		return instance;
	}
}
