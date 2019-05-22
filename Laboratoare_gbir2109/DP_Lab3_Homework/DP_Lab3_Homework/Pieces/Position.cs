namespace DP_Lab3_Homework.Pieces
{
    public class Position
    {
        public int HorizontalPos { get; set; }

        public int VerticalPos { get; set; }

        public override bool Equals(object obj)
        {
            if (this == obj) return true;
            if (obj == null || this.GetType() != obj.GetType()) return false;
            Position position = (Position)obj;
            return VerticalPos == position.VerticalPos &&
                    HorizontalPos == position.HorizontalPos;
        }
    }
}