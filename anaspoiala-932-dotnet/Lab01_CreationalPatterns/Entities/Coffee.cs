using System.Collections.Generic;
using System.Text;

namespace CoffeeMachine.Entities
{
	public abstract class Coffee
	{
		protected List<CoffeeIngredient> ingredients = new List<CoffeeIngredient>();
		public List<CoffeeIngredient> Ingredients { get => ingredients; }

		public abstract string Drink();

		public override string ToString()
		{
			var builder = new StringBuilder();

			foreach (var ingredient in ingredients)
			{
				builder.AppendLine("- " + ingredient.ToString());
			}

			return builder.ToString();
		}
	}
}
