using System.Collections.Generic;

namespace Lab1.Domain
{
    public class Cappuccino:ICoffee
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
                            new Ingredient(0.25, Unit.cups, IngredientType.coffeebeans, CoffeeFeature.roasted),
                            new Ingredient(2, Unit.cups, IngredientType.water, null),
                            new Ingredient(100, Unit.ml, IngredientType.milk, CoffeeFeature.foamed),
                        }
                    };
                }

                return recipe;
            }
        }

        public Cappuccino()
        {
            ingredients = new List<Ingredient>();
        }

        public string GetCoffeeType()
        {
            return "Cappuccino";
        }
    }
}
