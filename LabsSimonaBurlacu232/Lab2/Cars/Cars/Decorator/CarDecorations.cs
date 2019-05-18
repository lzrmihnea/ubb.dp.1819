using Cars.Domain;
using System.Collections.Generic;

namespace Cars.Decorator
{
    public abstract class CarDecorations : Car
    {
        protected Car decoratedCar;

        public CarDecorations(Car car)
        {
            this.decoratedCar = car;
        }

        public override IList<CarPart> GetCarParts()
        {
            return decoratedCar.GetCarParts();
        }

        public override double GetPrice()
        {
            return decoratedCar.GetPrice();
        }

        public override string GetDescription()
        {
            return decoratedCar.GetDescription();
        }
    }
}