using System;
using System.Text;

namespace CoffeeMachine
{
	public class CoffeeIngredient
	{
		public float Quantity { get; set; }
		public string MeasurementUnit { get; set; }
		public string IngredientName { get; set; }
		public string Adjective { get; set; } = "";


		public CoffeeIngredient(float quantity, string measurementUnit, string ingredientName)
		{
			Quantity = quantity;
			MeasurementUnit = measurementUnit;
			IngredientName = ingredientName;
			Adjective = "";
		}

		public CoffeeIngredient(float quantity, string measurementUnit, string ingredientName, string adjective)
		{
			Quantity = quantity;
			MeasurementUnit = measurementUnit;
			IngredientName = ingredientName;
			Adjective = adjective;
		}


		public override int GetHashCode()
		{
			return HashCode.Combine(Quantity, MeasurementUnit, IngredientName, Adjective);
		}

		public override bool Equals(object obj)
		{
			if ((obj == null) || !GetType().Equals(obj.GetType()))
				return false;

			CoffeeIngredient ingredient = (CoffeeIngredient)obj;

			return (Quantity == ingredient.Quantity) &&
				(MeasurementUnit == ingredient.MeasurementUnit) &&
				(IngredientName == ingredient.IngredientName) &&
				(Adjective == ingredient.Adjective);
		}


		public override string ToString()
		{
			var builder = new StringBuilder();

			builder.Append($"{Quantity} {MeasurementUnit} of {IngredientName}");

			if (!Adjective.Equals(""))
				builder.Append($", {Adjective}");

			return builder.ToString();
		}
	}
}