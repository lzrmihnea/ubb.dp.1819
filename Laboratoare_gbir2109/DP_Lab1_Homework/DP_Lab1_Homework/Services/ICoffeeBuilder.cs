using System;
using System.Collections.Generic;
using System.Text;

namespace DP_Lab1_Homework.Services
{
    public interface ICoffeeBuilder
    {
        void Reset();

        void AddCoffee();

        void AddWater();

        void AddMilk();
    }
}
