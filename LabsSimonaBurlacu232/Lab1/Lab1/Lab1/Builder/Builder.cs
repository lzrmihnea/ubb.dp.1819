using Lab1.Domain;

namespace Lab1.Builder
{
    public interface IBuilder
    {
        void AddIngredient(Ingredient ingredient);
        ICoffee GetPreparedCoffee();
    }
}
