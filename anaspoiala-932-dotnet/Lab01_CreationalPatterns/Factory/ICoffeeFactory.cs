using CoffeeMachine.Entities;
using System;
using System.Collections.Generic;
using System.Text;

namespace CoffeeMachine.Factory
{
	public interface ICoffeeFactory
	{
		Coffee MakeCoffee(List<CoffeeIngredient> IngredientList);
	}
}
