using System.Collections.Generic;

namespace CoffeeMachine.Entities
{
	public class Espresso : Coffee
	{
		// 2 cups water 
		// 0.25 cups coffee-beans roasted
		private static new List<CoffeeIngredient> ingredients = new List<CoffeeIngredient>
		{
			new CoffeeIngredient(2f, "cups", "water"),
			new CoffeeIngredient(0.25f, "cups", "coffee-beans", "roasted")
		};

		public static new List<CoffeeIngredient> Ingredients { get => ingredients; }

		public override string Drink()
		{
			return $"Drinking an Espresso.";
		}
	}
}
