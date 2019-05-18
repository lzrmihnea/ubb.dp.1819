using Lab1.Domain;

namespace Lab1.Builder
{
    public class AmericanoBuilder : IBuilder
    {
        Americano americano;
        public AmericanoBuilder()
        {
            americano = new Americano();
        }

        public void AddIngredient(Ingredient ingredient)
        {
            americano.ingredients.Add(ingredient);
        }

        public ICoffee GetPreparedCoffee()
        {
            return americano;
        }
    }
}
