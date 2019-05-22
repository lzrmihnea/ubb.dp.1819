using System;
using System.Collections.Generic;
using System.Text;

namespace DP_Lab1_Homework.Models
{
    public class Espresso : BaseCoffee
    {
        public Espresso()
        {
            Ingredients = new List<Ingredient>();
            CoffeeType = Coffee.Espresso;
        }
    }
}
