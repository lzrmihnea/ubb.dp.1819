using System.Collections.Generic;

namespace CoffeeMachine.Entities
{
	public class Cappuccino : Coffee
	{
		public static new List<CoffeeIngredient> Ingredients { get; } = new List<CoffeeIngredient>
		{
			new CoffeeIngredient(2f, "cups", "water"),
			new CoffeeIngredient(0.25f, "cups", "coffee-beans", "roasted"),
			new CoffeeIngredient(100f, "ml", "milk", "foamed")
		};


		public override string Drink()
		{
			return $"Drinking a Cappuccino.";
		}
	}
}
