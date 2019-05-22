using System;
using System.Collections.Generic;
using System.Text;

namespace DP_Lab1_Homework.Models
{
    public class Americano : BaseCoffee
    {
        public Americano()
        {
            Ingredients = new List<Ingredient>();
            CoffeeType = Coffee.Americano;
        }
    }
}
