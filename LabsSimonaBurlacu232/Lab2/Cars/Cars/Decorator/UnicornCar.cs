using Cars.Domain;

namespace Cars.Decorator
{
    public class UnicornCar:CarDecorations
    {
        public UnicornCar(Car car) : base(car) { }

        public override double GetPrice()
        {
            return decoratedCar.GetPrice() + 2000;
        }

        public override string GetDescription()
        {
            return decoratedCar.GetDescription() + "+unicorn decoration";
        }
    }
}
