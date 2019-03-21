package model.coffee;

import model.ingredient.Ingredient;

public class CoffeeBuilder {
	private Coffee coffee;

	public CoffeeBuilder() {
		this.coffee = new Coffee();
	}

	public CoffeeBuilder ingredient(Ingredient ingredient) {
		this.coffee.addIngredient(ingredient);
		return this;
	}
}
