using System.Collections.Generic;

namespace CoffeeMachine.Entities
{
	public class Americano : Coffee
	{
		public static new List<CoffeeIngredient> Ingredients { get; } = new List<CoffeeIngredient>
		{
			new CoffeeIngredient(4f, "cups", "water"),
			new CoffeeIngredient(0.25f, "cups", "coffee-beans", "roasted")
		};

		public override string Drink()
		{
			return $"Drinking an Americano Coffee.";
		}
	}
}
