using DP_Lab1_Homework.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace DP_Lab1_Homework.Services
{
    public class CoffeeFactory
    {
        private readonly Dictionary<Coffee, Recipe> coffeTypes;

        public CoffeeFactory()
        {
            var americanoRecipe = new Recipe(
                new Ingredient { Quantity = 4, Unit = Unit.Cup, Type = IngredientType.Water, State = string.Empty },
                new Ingredient { Quantity = 0.25f, Unit = Unit.Cup, Type = IngredientType.CoffeeBeans, State = "roasted" }
                );

            var cappuccinoRecipe = new Recipe(
                new Ingredient { Quantity = 2, Unit = Unit.Cup, Type = IngredientType.Water, State = string.Empty },
                new Ingredient { Quantity = 0.25f, Unit = Unit.Cup, Type = IngredientType.CoffeeBeans, State = "roasted"},
                new Ingredient { Quantity = 100, Unit = Unit.Ml, Type = IngredientType.Milk, State = "foamed"}
                );

            var espressoRecipe = new Recipe(
                new Ingredient { Quantity = 2, Unit = Unit.Cup, Type = IngredientType.Water, State = string.Empty },
                new Ingredient { Quantity = 0.25f, Unit = Unit.Cup, Type = IngredientType.CoffeeBeans, State = "roasted" }
                );

            var flatWhiteRecipe = new Recipe(
                new Ingredient { Quantity = 2, Unit = Unit.Cup, Type = IngredientType.Water, State = string.Empty },
                new Ingredient { Quantity = 5f, Unit = Unit.Cup, Type = IngredientType.CoffeeBeans, State = "roasted" },
                new Ingredient { Quantity = 100, Unit = Unit.Ml, Type = IngredientType.Milk, State = "foamed" }
                );

            coffeTypes = new Dictionary<Coffee, Recipe>
            {
                { Coffee.Americano , americanoRecipe },
                { Coffee.Cappuccino , cappuccinoRecipe },
                { Coffee.FlatWhite , flatWhiteRecipe },
                { Coffee.Espresso , espressoRecipe }
            };
        }

        public Coffee GetCoffee(Recipe recipe)
        {
            var matched = coffeTypes.FirstOrDefault(pair => pair.Value.Equals(recipe));

            return matched.Equals(default(KeyValuePair<Coffee,Recipe>)) ? Coffee.NoResults : matched.Key;
        }
    }
}
