package model.coffee;

import model.ingredient.Ingredient;

import java.util.List;

public class Coffee {
	private List<Ingredient> ingredients;

	public Coffee(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	Coffee() {
	}

	void addIngredient(Ingredient i) {
		this.ingredients.add(i);
	}

	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	public boolean isEqual(Coffee c) {
		if (this.ingredients.size() != c.getIngredients().size())
			return false;

		for (Ingredient i : ingredients) {
			boolean exists = false;

			for (Ingredient j : c.getIngredients())
				if (i.equals(j))
					exists = true;
			if (!exists)
				return false;
		}

		return true;
	}
}
