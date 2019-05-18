namespace Cars.Domain
{
    public class Wheel:CarPart
    {
        public Wheel()
        {
            SetPrice(500);
        }

        public WheelType WheelType { get; set; }

        public static string ToString()
        {
            return "wheel";
        }
    }
}
