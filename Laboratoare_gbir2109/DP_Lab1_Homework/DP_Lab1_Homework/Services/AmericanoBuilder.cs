using DP_Lab1_Homework.Models;
using System;
using System.Collections.Generic;
using System.Text;

namespace DP_Lab1_Homework.Services
{
    public class AmericanoBuilder : ICoffeeBuilder
    {
        private Americano coffee;

        public AmericanoBuilder()
        {
            coffee = new Americano();
        }

        public void AddCoffee()
        {
            coffee.Ingredients.Add(new Ingredient { Quantity = 0.25f, Unit = Unit.Cup, Type = IngredientType.CoffeeBeans, State = "roasted" });
        }

        public void AddWater()
        {
            coffee.Ingredients.Add(new Ingredient { Quantity = 4, Unit = Unit.Cup, Type = IngredientType.Water, State = string.Empty });
        }

        public void AddMilk(){}

        public void Reset()
        {
            coffee = new Americano();
        }

        public Americano GetResult() => coffee;

    }
}
