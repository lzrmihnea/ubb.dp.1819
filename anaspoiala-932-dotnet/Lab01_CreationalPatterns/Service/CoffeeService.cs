using CoffeeMachine.Exceptions;
using System;

namespace CoffeeMachine
{
	public class CoffeeService
	{
		public static CoffeeIngredient GetCoffeeIngredient(string line)
		{
			string[] tokens = line.Split(' ', StringSplitOptions.RemoveEmptyEntries);

			ValidateTokens(tokens);

			if (tokens.Length == 4)
				return new CoffeeIngredient(float.Parse(tokens[0]), tokens[1], tokens[2], tokens[3]);

			return new CoffeeIngredient(float.Parse(tokens[0]), tokens[1], tokens[2]);
		}

		private static void ValidateTokens(string[] tokens)
		{
			if (tokens.Length != 3 && tokens.Length != 4)
				throw new CoffeeException("Invalid ingredient number!");
			if (!float.TryParse(tokens[0], out float result))
				throw new CoffeeException("Invalid ingredient type!");
		}
	}
}
