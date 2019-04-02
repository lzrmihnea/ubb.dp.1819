using CoffeeMachine.Entities;
using System.Collections.Generic;

namespace CoffeeMachine.Factory
{
	public class CoffeeFactory : ICoffeeFactory
	{
		public Coffee MakeCoffee(List<CoffeeIngredient> ingredientList)
		{
			if (ingredientList == null || ingredientList.Count == 0)
			{
				return new CustomCoffee();
			}
			else if (CompareIngredientLists(ingredientList, Americano.Ingredients))
			{
				return new Americano();
			}
			else if (CompareIngredientLists(ingredientList, Cappuccino.Ingredients))
			{
				return new Cappuccino();
			}
			else if (CompareIngredientLists(ingredientList, Espresso.Ingredients))
			{
				return new Espresso();
			}
			else if (CompareIngredientLists(ingredientList, Irish.Ingredients))
			{
				return new Irish();
			}
			else  // Custom Coffee
			{
				var coffee = new CustomCoffee();
				coffee.AddIngredients(ingredientList);
				return coffee;
			}
		}


		private bool CompareIngredientLists(List<CoffeeIngredient> list1, List<CoffeeIngredient> list2)
		{
			if (list1.Count != list2.Count)
				return false;

			for (int i = 0; i < list1.Count; i++)
			{
				if (!list1.Contains(list2[i]))
					return false;
				if (!list2.Contains(list1[i]))
					return false;
			}

			return true;
		}
	}
}
