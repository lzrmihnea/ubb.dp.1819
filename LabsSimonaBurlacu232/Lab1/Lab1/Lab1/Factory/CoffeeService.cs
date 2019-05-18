using Lab1.Builder;
using Lab1.Domain;

namespace Lab1.Services
{
    public class CoffeeService
    {

        public IBuilder MakeCoffee(Recipe recipe)
        {
            if(recipe.IsSameRecipe(Espresso.Recipe))
            {
                return new EspressoBuilder();
            }
            if (recipe.IsSameRecipe(Americano.Recipe))
            {
                return new AmericanoBuilder();
            }
            if (recipe == Cappuccino.Recipe)
            {
                return new CappuccinoBuilder();
            }
            if (recipe == Milkccino.Recipe)
            {
                return new MilkccinoBuilder();
            }
            return null;
        }
    }
}
