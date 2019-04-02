using CoffeeMachine.Exceptions;
using System.Collections.Generic;

namespace CoffeeMachine.Entities
{
	public class CustomCoffee : Coffee
	{
		public void AddIngredient(CoffeeIngredient ingredient)
		{
			if (ingredient == null)
				throw new CoffeeException("Cannot add null ingredient!");

			this.ingredients.Add(ingredient);
		}

		public void AddIngredients(IEnumerable<CoffeeIngredient> ingredients)
		{
			if (ingredients == null)
				throw new CoffeeException("Cannot add null ingredients!");

			foreach (var ingredient in ingredients)
			{
				this.ingredients.Add(ingredient);
			}
		}

		public override string Drink()
		{
			return $"Drinking a Custom Coffee made of:\n{base.ToString()}";
		}
	}
}
