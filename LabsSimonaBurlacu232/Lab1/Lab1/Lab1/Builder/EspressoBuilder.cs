using System;
using Lab1.Domain;

namespace Lab1.Builder
{
    public class EspressoBuilder : IBuilder
    {
        Espresso espresso;
        public EspressoBuilder()
        {
            espresso = new Espresso();
        }
        public void AddIngredient(Ingredient ingredient)
        {
            espresso.ingredients.Add(ingredient);
        }

        public ICoffee GetPreparedCoffee()
        {
            return espresso;
        }
    }
}
