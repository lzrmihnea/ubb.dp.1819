namespace Lab1.Domain
{
    public class Ingredient
    {
        private double quantity;
        private Unit unit;
        public IngredientType ingredientType;
        public CoffeeFeature? coffeFeature;

        public Ingredient(double quantity, Unit unit, IngredientType ingredient, CoffeeFeature? coffeFeature)
        {
            this.quantity = quantity;
            this.unit = unit;
            this.ingredientType = ingredient;
            this.coffeFeature = coffeFeature;
        }

        public bool IsSameIngredient(Ingredient b)
        {
            var a = this;
            if (b == null) return false;
            return a.quantity == b.quantity && a.coffeFeature == b.coffeFeature && a.ingredientType == b.ingredientType && a.unit == b.unit;
        }
    }
}
