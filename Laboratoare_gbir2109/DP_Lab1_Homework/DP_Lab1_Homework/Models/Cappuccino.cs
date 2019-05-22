using System;
using System.Collections.Generic;
using System.Text;

namespace DP_Lab1_Homework.Models
{
    public class Cappuccino : BaseCoffee
    {
        public Cappuccino()
        {
            Ingredients = new List<Ingredient>();
            CoffeeType = Coffee.Cappuccino;
        }
    }
}
