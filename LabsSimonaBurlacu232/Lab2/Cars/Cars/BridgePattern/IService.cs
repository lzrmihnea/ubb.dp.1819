using Cars.Domain;
using System.Collections.Generic;

namespace Cars.BridgePattern
{
    public interface IService 
    {
        Car CreateCar(List<CarPart> carInputComponents);
    }
}
