using CoffeeMachine.Builder;
using CoffeeMachine.Entities;
using CoffeeMachine.Factory;
using System;
using System.Collections.Generic;

namespace CoffeeMachine
{
	class Program
	{
		private static readonly string coffee1 = @"../../../Files/coffee01.txt";
		private static readonly string coffee2 = @"../../../Files/coffee02.txt";
		private static readonly string coffee3 = @"../../../Files/coffee03.txt";
		private static readonly string coffee4 = @"../../../Files/coffee04.txt";
		private static readonly string coffee5 = @"../../../Files/coffee05.txt";

		static void Main(string[] args)
		{
			var ingredients1 = GetIngredientsFromFile(coffee1);
			var ingredients2 = GetIngredientsFromFile(coffee2);
			var ingredients3 = GetIngredientsFromFile(coffee3);
			var ingredients4 = GetIngredientsFromFile(coffee4);
			var ingredients5 = GetIngredientsFromFile(coffee5);

			var ingredientLists = new List<List<CoffeeIngredient>>
			{
				GetIngredientsFromFile(coffee1),
				GetIngredientsFromFile(coffee2),
				GetIngredientsFromFile(coffee3),
				GetIngredientsFromFile(coffee4),
				GetIngredientsFromFile(coffee5)
			};

			// Factory -----------

			Console.WriteLine("Factory Pattern:");

			var coffeeFactory = new CoffeeFactory();

			foreach(var ingredientList in ingredientLists)
			{
				Coffee createdCoffee = coffeeFactory.MakeCoffee(ingredientList);
				Console.WriteLine(">> " + createdCoffee.Drink());
			}



			Console.WriteLine();

			// Builder -----------

			Console.WriteLine("Builder Pattern:");

			var coffeeBuilder = new CoffeeBuilder();

			Coffee builtCoffee = coffeeBuilder
				.AddIngredient(new CoffeeIngredient(4f, "cups", "water"))
				.AddIngredient(new CoffeeIngredient(0.25f, "cups", "coffee-beans", "roasted"))
				.AddIngredient(new CoffeeIngredient(0.25f, "cup", "sugar", "granulated"))
				.AddIngredient(new CoffeeIngredient(1f, "pinch", "cinnamon"))
				.AddIngredient(new CoffeeIngredient(0.25f, "tsp", "vanilla"))
				.BuildCoffee();

			Console.WriteLine(">> " + builtCoffee.Drink());

			Console.ReadKey();
		}

		static List<CoffeeIngredient> GetIngredientsFromFile(string path)
		{
			var lines = FileService.ReadLines(path);
			var ingredients = new List<CoffeeIngredient>();

			foreach (var line in lines)
			{
				ingredients.Add(CoffeeService.GetCoffeeIngredient(line));
			}

			return ingredients;
		}
	}
}
