using System.Collections.Generic;

namespace CoffeeMachine.Entities
{
	public class Irish : Coffee
	{
		public static new List<CoffeeIngredient> Ingredients { get; } = new List<CoffeeIngredient>
		{
			new CoffeeIngredient(2f, "cups", "coffee", "hot"),
			new CoffeeIngredient(0.75f, "cup", "whiskey"),
			new CoffeeIngredient(0.25f, "cup", "sugar"),
			new CoffeeIngredient(0.75f, "cup", "cream", "fresh")
		};

		public override string Drink()
		{
			return $"Drinking an Irish Coffee.";
		}
	}
}
