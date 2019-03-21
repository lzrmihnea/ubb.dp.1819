package services.impl;

import model.coffee.Coffee;
import model.ingredient.Ingredient;
import services.CoffeeFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum CoffeeTypes implements CoffeeFactory {
	ESPRESSO("Espresso",
			Arrays.asList(Ingredient.builder().quantity(2).unit("cups").ingredient("water").build(),
					Ingredient.builder().quantity(0.25).unit("cups").ingredient("coffee-beans").adjective("roasted").build())),
	CAPPUCCINO("Cappuccio",
			Arrays.asList(Ingredient.builder().quantity(2).unit("cups").ingredient("water").build(),
					Ingredient.builder().quantity(0.25).unit("cups").ingredient("coffee-beans").adjective("roasted").build(),
					Ingredient.builder().quantity(100).unit("ml").ingredient("foamed milk").build())),
	AMERICANO("Americano",
			Arrays.asList(Ingredient.builder().quantity(4).unit("cups").ingredient("water").build(),
					Ingredient.builder().quantity(0.25).unit("cups").ingredient("coffee-beans").adjective("roasted").build())),
	FLAT_WHITE("Flat White",
			Arrays.asList(Ingredient.builder().quantity(2).unit("cups").ingredient("water").build(),
					Ingredient.builder().quantity(0.25).unit("cups").ingredient("coffee-beans").adjective("roasted").build(),
					Ingredient.builder().quantity(200).unit("ml").ingredient("foamed milk").build()));

	List<Ingredient> ingredients;
	String name;

	CoffeeTypes(String name, List<Ingredient> ingredients) {
		this.name = name;
		this.ingredients = ingredients;
	}

	@Override
	public Coffee getCoffee() {
		return new Coffee(this.ingredients);
	}

	public String getName() {
		return this.name;
	}

	public boolean isThisType(Coffee coffee) {
		return this.getCoffee().isEqual(coffee);
	}

	public static CoffeeTypes identifyType(List<Ingredient> ingredients) {

		Coffee c = new Coffee(ingredients);

		CoffeeTypes[] types = CoffeeTypes.values();

		for (CoffeeTypes t : types)
			if (t.getCoffee().isEqual(c))
				return t;

		return null;
	}
}
