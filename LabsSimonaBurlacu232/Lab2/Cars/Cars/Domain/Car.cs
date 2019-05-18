using Cars.Composite;
using System.Collections.Generic;

namespace Cars.Domain
{
    public class Car:IPriceable
    {
        private IList<CarPart> carParts;

        public Car()
        {
            carParts = new List<CarPart>();
        }

        public Car(IList<CarPart> carParts)
        {
            this.carParts = carParts;
        }

        public virtual IList<CarPart> GetCarParts()
        {
            return carParts;
        }

        public virtual double GetPrice()
        {
            double sum = 0;
            foreach (var part in carParts)
            {
                sum += part.GetPrice();
            }
            return sum;
        }

        public void AddCarPart(CarPart carPart)
        {
            carParts.Add(carPart);
        }

        public virtual string GetDescription()
        {
            return "Simple car ";
        }
    }
}
