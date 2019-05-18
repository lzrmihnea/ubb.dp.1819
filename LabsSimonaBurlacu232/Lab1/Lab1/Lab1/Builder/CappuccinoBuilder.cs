using Lab1.Domain;

namespace Lab1.Builder
{
    public class CappuccinoBuilder : IBuilder
    {
        Cappuccino cappuccino;
        public CappuccinoBuilder()
        {
            cappuccino = new Cappuccino();
        }
        public void AddIngredient(Ingredient ingredient)
        {
            cappuccino.ingredients.Add(ingredient);
        }

        public ICoffee GetPreparedCoffee()
        {
            return cappuccino;
        }
    }
}
