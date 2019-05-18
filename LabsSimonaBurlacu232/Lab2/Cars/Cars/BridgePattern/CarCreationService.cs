using Cars.Domain;
using System.Collections.Generic;

namespace Cars.BridgePattern
{
    public class CarCreationService:IService
    {
        public Car CreateCar(List<CarPart> carInputComponents)
        {
            return new Car(carInputComponents);
        }
    }
}
