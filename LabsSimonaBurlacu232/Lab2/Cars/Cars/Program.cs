using Cars.AdapterPattern;
using Cars.BridgePattern;
using Cars.Decorator;
using Cars.Proxy;
using System;

namespace Cars
{
    public class Program
    {
        static void Main(string[] args)
        {
            //Adapter - use file service to map car parts
            ITarget adapter = new Adapter("./Resources/carParts.txt");
            var carParts=adapter.GetCarParts();

            //Create car using bridge
            var carCreationService = new CarCreationService();
            var car1 = carCreationService.CreateCar(carParts);

            //Create car using proxy service
            var proxyCreationService = new ProxyCarCreationService();
            var car2 = proxyCreationService.CreateCar(carParts);
            Console.WriteLine();

            //Composite
            foreach (var component in car1.GetCarParts())
            {
                Console.WriteLine(component.ToString() + " costs " + component.GetPrice());
            }
            Console.WriteLine("Car1 costs " + car1.GetPrice());
            Console.WriteLine();

           //Decorator
           var carb = new RainbowCar(car1);
            var decoratedCar = new UnicornCar(carb);
            Console.WriteLine("Decorated car cost: " + decoratedCar.GetPrice());
            Console.WriteLine("Decorated car description: " + decoratedCar.GetDescription());

            Console.ReadKey();
        }
    }
}
