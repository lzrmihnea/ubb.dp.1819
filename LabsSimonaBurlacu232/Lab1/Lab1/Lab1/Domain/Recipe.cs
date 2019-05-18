using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab1.Domain
{
    public class Recipe
    {
        public List<Ingredient> Ingredients { get; set; }

        public bool IsSameRecipe(Recipe b)
        {
            var a = this;
            if (b == null)
                return false;

            foreach (var ingredient in a.Ingredients)
            {
                if (!b.Ingredients.Any(i => i.IsSameIngredient(ingredient))) return false;
            }
           return a.Ingredients.Count == a.Ingredients.Count;
        }
    }
}
