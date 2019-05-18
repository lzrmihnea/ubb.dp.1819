using Cars.Composite;

namespace Cars.Domain
{
    public abstract class CarPart : IPriceable
    {
        private double price;

        public double GetPrice()
        {
            return price;
        }

        public void SetPrice(double price)
        {
            this.price = price;
        }
    }
}
