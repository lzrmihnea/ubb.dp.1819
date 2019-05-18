using Lab1.Domain;
using Lab1.Services;
using System;
using System.Collections.Generic;

namespace Lab1
{
    class Program
    {
        static void Main(string[] args)
        {
            var fileService = new FileService("./Resources/ingredients.txt");

            var ingredients = fileService.ReadLinesFromFile();
            var units = new List<string>() { "ml", "cup", "cups", "g", "l" };
            var products = new List<string>() { "milk", "water", "coffeebeans", "whippedcream" };
            var features = new List<string>() { "boiled", "steamed", "roasted", "foamed" };

            var ingredientsValidator = new IngredientsService(ingredients, units, products, features);

            var coffeeIngredients = new List<Ingredient>();
            foreach (var i in ingredients)
            {
                try
                {
                    var ingredient=ingredientsValidator.IsIngredientValid(i);
                    coffeeIngredients.Add(ingredient);
                }
                catch(Exception ex)
                {
                    Console.WriteLine(ex);
                }
            }

            var recipe = new Recipe() { Ingredients = coffeeIngredients };

            var coffeeService = new CoffeeService();
            var coffeeBuilder = coffeeService.MakeCoffee(recipe);
            if(coffeeBuilder==null)
            {
                Console.WriteLine("We don't know to prepare that coffee");
            }
            else
            {
                var preparedCoffee = coffeeBuilder.GetPreparedCoffee();
                Console.WriteLine($"Here is your coffee {preparedCoffee.GetCoffeeType()}");

            }




            Console.ReadKey();
        }
    }
}
