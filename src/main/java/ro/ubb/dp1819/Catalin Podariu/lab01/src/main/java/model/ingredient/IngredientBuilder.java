package model.ingredient;

public class IngredientBuilder {
	private Ingredient ingredient;

	IngredientBuilder() {
		this.ingredient = new Ingredient();
	}

	public IngredientBuilder quantity(double quantity) {
		ingredient.setQuantity(quantity);
		return this;
	}

	public IngredientBuilder unit(String unit) {
		ingredient.setUnit(unit);
		return this;
	}

	public IngredientBuilder ingredient(String ingredient) {
		this.ingredient.setIngredient(ingredient);
		return this;
	}

	public IngredientBuilder adjective(String adjective) {
		ingredient.setAdjective(adjective);
		return this;
	}

	public Ingredient build() {
		return ingredient;
	}
}
