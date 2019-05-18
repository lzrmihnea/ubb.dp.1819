using System;

namespace ChessGame.Pieces
{
    public abstract class ChessPiece
    {
        public Position Position { get; set; }
        public bool IsAlive { get; set; }
        public ChessPieceColor Color { get; set; }

        public ChessPiece(Position position, bool isAlive, ChessPieceColor color)
        {
            Position = position;
            IsAlive = isAlive;
            Color = color;
        }

        public override string ToString()
        {
            return "Position  (" + Position.X + ", " + Position.Y + ") " + Color.ToString() + " IsAlive? " + IsAlive;

        }

    }
}
