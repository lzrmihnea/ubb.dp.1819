using DP_Lab1_Homework.Models;
using System;
using System.Collections.Generic;
using System.Text;

namespace DP_Lab1_Homework.Services
{
    public class CappuccinoBuilder : ICoffeeBuilder
    {
        private Cappuccino coffee;

        public CappuccinoBuilder()
        {
            coffee = new Cappuccino();
        }

        public void AddCoffee()
        {
            coffee.Ingredients.Add(new Ingredient { Quantity = 0.25f, Unit = Unit.Cup, Type = IngredientType.CoffeeBeans, State = "roasted" });
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
            coffee = new Cappuccino();
        }

        public Cappuccino GetResult() => coffee;

    }
}
