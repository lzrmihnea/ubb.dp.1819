using System.Collections.Generic;

namespace Lab1.Domain
{
    public class Milkccino:ICoffee
    {
        public IList<Ingredient> ingredients;
        public static Recipe recipe;
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
                            new Ingredient(1, Unit.cups, IngredientType.milk, CoffeeFeature.foamed),
                        }
                    };
                }
                return recipe;
            }
        }

        public Milkccino()
        {
            ingredients = new List<Ingredient>();
        }
        public string GetCoffeeType()
        {
            return "Milkccino";
        }
    }
}
