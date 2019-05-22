using System;
using System.Collections.Generic;
using System.Text;

namespace DP_Lab1_Homework.Models
{
    public class BaseCoffee
    {
        public List<Ingredient> Ingredients { get; set; }

        public Coffee CoffeeType { get; protected set; }
    }
}
