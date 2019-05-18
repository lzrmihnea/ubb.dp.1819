using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Lab1.Domain;

namespace Lab1.Builder
{
    public class MilkccinoBuilder : IBuilder
    {
        Milkccino milkccino;
        public void AddIngredient(Ingredient ingredient)
        {
            milkccino.ingredients.Add(ingredient);
        }

        public ICoffee GetPreparedCoffee()
        {
            return milkccino;
        }
    }
}
