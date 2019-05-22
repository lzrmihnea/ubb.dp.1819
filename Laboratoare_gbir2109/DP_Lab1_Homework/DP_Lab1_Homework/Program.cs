using DP_Lab1_Homework.Models;
using DP_Lab1_Homework.Services;
using System;
using System.Collections.Generic;
using System.Linq;

namespace DP_Lab1_Homework
{
    class Program
    {
        private const string FILE_PATH = @"D:\VSProjects\DP_Lab1_Homework\DP_Lab1_Homework\Ingredients.txt";

        static void Main(string[] args)
        {
            var fileReader = new LocalFileReader();
            var lineParser = new LineParser();
            var coffeeMaker = new CoffeeFactory();

            try
            {
                var lines = fileReader.GetAllLines(FILE_PATH);
                
                var ingredients = lines.Select(line => lineParser.ParseLine(line)).ToArray();
                var recipe = new Recipe(ingredients);

                var coffee = coffeeMaker.GetCoffee(recipe);
                Director coffeeDirector = null;
                BaseCoffee madeCoffee = null;

                switch (coffee)
                {
                    case Coffee.Espresso:
                        var espressoBuilder = new EspressoBuilder();
                        coffeeDirector = new Director(espressoBuilder);
                        coffeeDirector.MakeCoffee();
                        madeCoffee = espressoBuilder.GetResult();
                        break;
                    case Coffee.Cappuccino:
                        var cappucinoBuilder = new CappuccinoBuilder();
                        coffeeDirector = new Director(cappucinoBuilder);
                        coffeeDirector.MakeCoffee();
                        madeCoffee = cappucinoBuilder.GetResult();
                        break;
                    case Coffee.Americano:
                        var americanoBuilder = new AmericanoBuilder();
                        coffeeDirector = new Director(americanoBuilder);
                        coffeeDirector.MakeCoffee();
                        madeCoffee = americanoBuilder.GetResult();
                        break;
                    case Coffee.FlatWhite:
                        var flatWhiteBuilder = new FlatWhiteBuilder();
                        coffeeDirector = new Director(flatWhiteBuilder);
                        coffeeDirector.MakeCoffee();
                        madeCoffee = flatWhiteBuilder.GetResult();
                        break;
                    default:
                        Console.WriteLine("Recipe not recognized");
                        Console.ReadLine();
                        return;
                }
                
                Console.WriteLine(madeCoffee.ToString());
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }

            Console.ReadLine();
        }
    }
}
