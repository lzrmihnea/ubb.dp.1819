package model.ingredient;

import exceptions.CoffeeException;

import java.util.Arrays;
import java.util.List;

public class Ingredient {
	double quantity = 0;
	String unit = "";
	String ingredient = "";
	String adjective = "";

	public Ingredient(double quantity, String unit, String ingredient, String adjective) {
		this.quantity = quantity;
		this.unit = unit;
		this.ingredient = ingredient;
		this.adjective = adjective;
	}

	public Ingredient(double quantity, String unit, String ingredient) {
		this.quantity = quantity;
		this.unit = unit;
		this.ingredient = ingredient;
	}

	public Ingredient(String ingredientString) throws CoffeeException {
		List<String> words = Arrays.asList(ingredientString.split(" "));

		if (words.size() != 3 && words.size() != 4)
			throw new CoffeeException("invalid ingredient");

		this.quantity = Double.parseDouble(words.get(0));
		this.unit = words.get(1);
		this.ingredient = words.get(2);
		if (words.size() == 4)
			this.adjective = words.get(3);
	}

	Ingredient() {
	}

	public static IngredientBuilder builder() {
		return new IngredientBuilder();
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getIngredient() {
		return ingredient;
	}

	public void setIngredient(String ingredient) {
		this.ingredient = ingredient;
	}

	public String getAdjective() {
		return adjective;
	}

	public void setAdjective(String adjective) {
		this.adjective = adjective;
	}

	public boolean equals(Ingredient i) {
		return this.toString().equals(i.toString());
	}

	@Override
	public String toString() {
		return "Ingredient{" +
				"quantity=" + quantity +
				", unit='" + unit + '\'' +
				", ingredient='" + ingredient + '\'' +
				", adjective='" + adjective + '\'' +
				'}';
	}
}
