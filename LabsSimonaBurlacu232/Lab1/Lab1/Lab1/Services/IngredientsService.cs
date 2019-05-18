using Lab1.Domain;
using System;
using System.Collections.Generic;
using System.Linq;

namespace Lab1.Services
{
    public class IngredientsService
    {
        public IList<string> Features { get; set; }
        public IList<string> Ingredients { get; set; }
        public IList<string> Units { get; set; }
        public IList<string> Recipes { get; set; }


        public IngredientsService(IList<string> recipes, IList<string> units, IList<string> ingredients, IList<string> features)
        {
            this.Recipes = recipes;
            this.Units = units;
            this.Ingredients = ingredients;
            this.Features = features;
        }

        public Ingredient IsIngredientValid(string recipe)
        {
            var ingredientsLine = recipe.Split(' ');
            if (ingredientsLine.Length < 3 || ingredientsLine.Length > 4)
                throw new Exception($"This is not a valid ingredient {recipe}");

            string product = null;
            string feature = null;
            string unit = null;
            double quantity = 0;

            foreach (var word in ingredientsLine)
            {
                if (Features.Select(x => x.ToLower()).Contains(word.ToLower()))
                {
                    feature = word;
                    continue;
                }
                if (Ingredients.Select(x => x.ToLower()).Contains(word.ToLower()))
                {
                    product = word;
                    continue;
                }
                if (Units.Select(x => x.ToLower()).Contains(word.ToLower()))
                {
                    unit = word; 
                    continue;
                }
                var isQuantity = double.TryParse(word, out double q);
                if (isQuantity)
                {
                    quantity = q;
                    continue;
                }
            }

            if ( product!=null && unit!=null && quantity!=0)
            {
                var ingredient = new Ingredient(quantity,
                                   (Unit)Enum.Parse(typeof(Unit), unit),
                                   (IngredientType)Enum.Parse(typeof(IngredientType), product),
                                   null);
                if (feature!=null)
                {
                    ingredient.coffeFeature = (CoffeeFeature)Enum.Parse(typeof(CoffeeFeature), feature);
                }
                return ingredient;
            }

            throw new Exception($"This is not a valid ingredient {recipe}");
        }

    }
}
