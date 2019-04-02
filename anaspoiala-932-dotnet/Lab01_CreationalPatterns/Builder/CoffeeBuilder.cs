using CoffeeMachine.Entities;

namespace CoffeeMachine.Builder
{
	public class CoffeeBuilder : ICoffeeBuilder
	{
		private CustomCoffee coffee;

		public CoffeeBuilder()
		{
			coffee = new CustomCoffee();
		}

		public ICoffeeBuilder AddIngredient(CoffeeIngredient ingredient)
		{
			coffee.AddIngredient(ingredient);
			return this;
		}

		public Coffee BuildCoffee()
		{
			return coffee;
		}
	}
}
