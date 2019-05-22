using System;
using System.Collections.Generic;
using System.Text;

namespace DP_Lab3_Homework.Pieces
{
    public abstract class ChessPiece
    {
        public Position Position { get; set; }

        public bool IsAlive { get; set; }

        public ChessPieceColor Color { get; set; }

        public ChessPiece(int verticalPoz, int horizontalPoz, bool isAlive, ChessPieceColor color)
        {
            this.Position = new Position { HorizontalPos = horizontalPoz, VerticalPos = verticalPoz};
            this.IsAlive = isAlive;
            this.Color = color;
        }
    }

    public enum ChessPieceColor
    {
        WHITE,
        BLACK
    }
}
