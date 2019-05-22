using DP_Lab1_Homework.Models;
using System;
using System.Collections.Generic;
using System.Text;

namespace DP_Lab1_Homework.Services
{
    public class LineParser
    {
        public Ingredient ParseLine(string line)
        {
            string[] elements = line.Split(";");
            var isLineValid = elements.Length >= 3 && elements.Length <= 4;
            if (!isLineValid)
            {
                throw new Exception("Number of elements in line is invalid");
            }

            float quantity = float.Parse(elements[0]);
            Unit unit = Enum.Parse<Unit>(elements[1]);
            IngredientType type = Enum.Parse<IngredientType>(elements[2]);
            string state = string.Empty;

            if(elements.Length == 4)
            {
                state = elements[3];
            }

            return new Ingredient { Quantity = quantity, State = state, Type = type, Unit = unit };
        }
    }
}
