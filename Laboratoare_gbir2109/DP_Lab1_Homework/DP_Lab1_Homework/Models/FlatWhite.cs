using System;
using System.Collections.Generic;
using System.Text;

namespace DP_Lab1_Homework.Models
{
    public class FlatWhite : BaseCoffee
    {
        public FlatWhite()
        {
            Ingredients = new List<Ingredient>();
            CoffeeType = Coffee.FlatWhite;
        }
    }
}
