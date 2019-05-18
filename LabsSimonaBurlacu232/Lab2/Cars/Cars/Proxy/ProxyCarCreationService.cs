using Cars.BridgePattern;
using Cars.Domain;
using System;
using System.Collections.Generic;

namespace Cars.Proxy
{
    public class ProxyCarCreationService : IService
    {
        private readonly CarCreationService carCreationService;

        public ProxyCarCreationService()
        {
            carCreationService = new CarCreationService();
        }

        public Car CreateCar(List<CarPart> carInputComponents)
        {
            Console.WriteLine("Proxy: Creating a car...");
            var car = carCreationService.CreateCar(carInputComponents);
            Console.WriteLine($"Proxy: Car price = {car.GetPrice()}");
            return car;
        }
    }
}
