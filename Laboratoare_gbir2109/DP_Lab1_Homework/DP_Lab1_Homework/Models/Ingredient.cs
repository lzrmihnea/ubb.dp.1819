using System;
using System.Collections.Generic;
using System.Text;

namespace DP_Lab1_Homework.Models
{
    public class Ingredient
    {
        public float Quantity { get; set; }

        public Unit Unit { get; set; }

        public string State { get; set; }

        public IngredientType Type { get; set; }

        public override bool Equals(object obj)
        {
            var ingr = obj as Ingredient;

            if (ingr.Unit == Unit && ingr.Type == Type && ingr.State == State && ingr.Quantity == Quantity)
                return true;

            return false;
        }
    }
}
