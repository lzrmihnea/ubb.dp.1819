using DP_Lab1_Homework.Models;
using System;
using System.Collections.Generic;
using System.Text;

namespace DP_Lab1_Homework.Services
{
    public class FlatWhiteBuilder : ICoffeeBuilder
    {
        private FlatWhite coffee;

        public FlatWhiteBuilder()
        {
            coffee = new FlatWhite();
        }

        public void AddCoffee()
        {
            coffee.Ingredients.Add(new Ingredient { Quantity = 5f, Unit = Unit.Cup, Type = IngredientType.CoffeeBeans, State = "roasted" });
        }

        public void AddWater()
        {
            coffee.Ingredients.Add(new Ingredient { Quantity = 2, Unit = Unit.Cup, Type = IngredientType.Water, State = string.Empty });
        }

        public void AddMilk()
        {
            coffee.Ingredients.Add(new Ingredient { Quantity = 100, Unit = Unit.Ml, Type = IngredientType.Milk, State = "foamed" });
        }

        public void Reset()
        {
            coffee = new FlatWhite();
        }

        public FlatWhite GetResult() => coffee;

    }
}
