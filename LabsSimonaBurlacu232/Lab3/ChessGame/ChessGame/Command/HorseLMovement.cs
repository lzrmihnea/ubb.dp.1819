using ChessGame.Pieces;
using System;
using System.Collections.Generic;

namespace ChessGame.Command
{
    public class HorseLMovement : IMovementCommand
    {
        public IList<Position> ExecuteCommnad(ChessPiece chessPiece)
        {
            var positions = new List<Position>();
            positions.Add(new Position(chessPiece.Position.X + 2, chessPiece.Position.Y + 1));
            positions.Add(new Position(chessPiece.Position.X + 2, chessPiece.Position.Y - 1));
            positions.Add(new Position(chessPiece.Position.X - 2, chessPiece.Position.Y + 1));
            positions.Add(new Position(chessPiece.Position.X - 2, chessPiece.Position.Y - 1));
            return positions;
        }
    }
}
