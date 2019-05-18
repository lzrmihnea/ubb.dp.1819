namespace Cars.Domain
{
    public class Engine:CarPart
    {
        public Engine()
        {
            SetPrice(3000);
        }

        public EngineType EngineType { get; set; }

        public static string ToString()
        {
            return "engine";
        }
    }
}
