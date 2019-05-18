namespace Cars.Domain
{
    public class Paint:CarPart
    {
        public Paint()
        {
            SetPrice(1000);
        }
        public PaintType PaintType { get; set; }

        public static string ToString()
        {
            return "paint";
        }
    }
}
