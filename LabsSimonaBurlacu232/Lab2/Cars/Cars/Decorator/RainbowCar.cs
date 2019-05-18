using Cars.Domain;

namespace Cars.Decorator
{
    public class RainbowCar : CarDecorations
    {
        public RainbowCar(Car car) : base(car){}

        public override double GetPrice()
        {
            return decoratedCar.GetPrice() + 200;
        }

        public override string GetDescription()
        {
            return decoratedCar.GetDescription() + "+rainbow decoration";
        }
    }
}
