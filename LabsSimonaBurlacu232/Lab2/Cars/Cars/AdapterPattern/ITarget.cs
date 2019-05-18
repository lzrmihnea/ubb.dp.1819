using Cars.Domain;
using System.Collections.Generic;

namespace Cars.AdapterPattern
{
    public interface ITarget
    {
        List<CarPart> GetCarParts();
        List<CarPart> GetCarParts(List<string> lines);
    }
}
