using System;
using System.Collections.Generic;
using System.Text;

namespace DP_Lab1_Homework.Services
{
    public class Director
    {
        private readonly ICoffeeBuilder builder;

        public Director(ICoffeeBuilder builder)
        {
            this.builder = builder;
        }

        public void MakeCoffee()
        {
            builder.AddWater();
            builder.AddCoffee();
            builder.AddMilk();
        }
    }
}
