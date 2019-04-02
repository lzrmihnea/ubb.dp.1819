using System;
using System.Collections.Generic;
using System.Text;

namespace CoffeeMachine.Builder
{
	public interface ICoffeeBuilder
	{
		ICoffeeBuilder AddIngredient(CoffeeIngredient ingredient);
		Entities.Coffee BuildCoffee();
	}
}
