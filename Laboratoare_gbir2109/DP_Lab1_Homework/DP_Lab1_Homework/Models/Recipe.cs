using System;
using System.Collections.Generic;
using System.Text;

namespace DP_Lab1_Homework.Models
{
    public class Recipe
    {
        private readonly List<Ingredient> ingredients;

        public Recipe(params Ingredient[] ingr)
        {
            ingredients = new List<Ingredient>();

            for (int i = 0; i < ingr.Length; i++)
            {
                ingredients.Add(ingr[i]);
            }
        }

        public override bool Equals(object obj)
        {
            var newRec = obj as Recipe;
            
            if(ingredients.Count != newRec.ingredients.Count)
            {
                return false;
            }

            bool ingredientExists = true;

            newRec.ingredients.ForEach(ingr => { if (!ingredients.Contains(ingr)) ingredientExists = false; });

            return ingredientExists;
        }
    }
}
