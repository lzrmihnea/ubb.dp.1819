using System;

namespace CoffeeMachine.Exceptions
{
	public class CoffeeException : Exception
	{
		public CoffeeException()
		{
		}

		public CoffeeException(string message)
			: base(message)
		{
		}

		public CoffeeException(string message, Exception inner)
			: base(message, inner)
		{
		}
	}
}
