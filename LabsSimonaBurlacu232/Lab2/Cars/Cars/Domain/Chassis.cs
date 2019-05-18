namespace Cars.Domain
{
    public class Chassis : CarPart
    {
        public Chassis()
        {
            SetPrice(200);
        }

        public ChassisType ChassisType { get; set; }

        public static string ToString()
        {
            return "chassis";
        }

    }
}
