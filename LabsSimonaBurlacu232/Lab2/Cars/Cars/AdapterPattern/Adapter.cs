using Cars.Domain;
using System;
using System.Collections.Generic;

namespace Cars.AdapterPattern
{
    public class Adapter : ITarget
    {
        private FileService _adaptee;
        private string _file;

        public Adapter(string file)
        {
            _file = file;
            _adaptee = new FileService(file);
        }
        public List<CarPart> GetCarParts()
        {
            if(_adaptee == null)
                throw new Exception("No adaptee");

            var lines = _adaptee.ReadLinesFromFile();
            return ConvertLinesToCarParts(lines);
        }

        public List<CarPart> GetCarParts(List<string> lines)
        {
            return ConvertLinesToCarParts(lines);
        }

        private List<CarPart> ConvertLinesToCarParts(List<string> lines)
        {
            var carParts = new List<CarPart>();
            foreach(var line in lines)
            {
                var quantity = line.Split(' ')[0];
                var type = line.Split(' ')[1];
                var part = line.Split(' ')[2];
                int nr;
                bool isChassis = false;
                bool isEngine = false;
                bool isPaint = false;
                bool isWheel = false;
                var isInt = int.TryParse(quantity, out nr);
                if(!isInt)
                {
                    throw new Exception($"Invalid car part {line}");
                }

                if (part.Contains(Wheel.ToString()))
                {
                    WheelType wheelType = WheelType.SUMMER;
                    isWheel = Enum.TryParse<WheelType>(type.ToUpper(), out wheelType);
                    if (isWheel)
                    {
                        carParts.Add(new Wheel() { WheelType = wheelType });
                    }
                    continue;
                }

                if (part.Contains(Engine.ToString()))
                {
                    EngineType engineType = EngineType.DIESEL;
                    isEngine = Enum.TryParse<EngineType>(type.ToUpper(), out engineType);
                    if (isEngine)
                    {
                        carParts.Add(new Engine() { EngineType = engineType });
                    }
                    continue;
                }

                if (part.Contains(Chassis.ToString()))
                {
                    ChassisType chassisType = ChassisType.TITANIUM;
                    isChassis = Enum.TryParse<ChassisType>(type.ToUpper(), out chassisType);
                    if (isChassis)
                    {
                        carParts.Add(new Chassis() { ChassisType = chassisType });
                    }
                    continue;
                }


                if (part.Contains(Paint.ToString()))
                {
                    PaintType paintType = PaintType.BLACK;
                    isPaint = Enum.TryParse<PaintType>(type.ToUpper(), out paintType);
                    if (isPaint)
                    {
                        carParts.Add(new Paint() { PaintType = paintType });
                        
                    }
                    continue;

                }

                if (!isChassis && !isEngine && !isPaint && !isWheel)
                {
                    throw new Exception($"Invalid car part {line}");
                }
            }

            return carParts;
        }
    }
}
