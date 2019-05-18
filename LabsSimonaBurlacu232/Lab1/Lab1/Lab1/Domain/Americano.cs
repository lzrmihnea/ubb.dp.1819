using System.Collections.Generic;

namespace Lab1.Domain
{
    public class Americano:ICoffee
    {
        public IList<Ingredient> ingredients;
        private static Recipe recipe;
        public static Recipe Recipe
        {
            get
            {
                if (recipe == null)
                {
                    recipe = new Recipe()
                    {
                        Ingredients = new List<Ingredient>()
                        {
                            new Ingredient(0.25, Unit.cups, IngredientType.coffeebeans, CoffeeFeature.roasted),
                            new Ingredient(4, Unit.cups, IngredientType.water, null),
                        }
                    };
                }
                return recipe;
            }
        }

        public Americano()
        {
            ingredients = new List<Ingredient>();
        }

        public string GetCoffeeType()
        {
            return "Americano";
        }
    }
}
