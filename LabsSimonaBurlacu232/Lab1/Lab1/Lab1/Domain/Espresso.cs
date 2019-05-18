using System.Collections.Generic;

namespace Lab1.Domain
{
    public class Espresso: ICoffee
    {
        public IList<Ingredient> ingredients;
        private static Recipe recipe;
        public static Recipe Recipe
        {
            get {
                if (recipe == null)
                {
                    recipe=new Recipe()
                    {
                        Ingredients = new List<Ingredient>()
                        {
                            new Ingredient(0.25, Unit.cups, IngredientType.coffeebeans, CoffeeFeature.roasted),
                            new Ingredient(2, Unit.cups, IngredientType.water, null),
                        }
                    };
                }
                return recipe;
            }
            private set { Recipe = recipe; }
        }

        public Espresso()
        {
            ingredients = new List<Ingredient>();
        }

        public string GetCoffeeType()
        {
            return "Espresso";
        }
    }
}
