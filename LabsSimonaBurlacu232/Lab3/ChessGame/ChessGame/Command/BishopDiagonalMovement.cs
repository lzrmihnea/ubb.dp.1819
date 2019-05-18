using ChessGame.Pieces;
using System;
using System.Collections.Generic;

namespace ChessGame.Command
{
    public class BishopDiagonalMovement : IMovementCommand
    {
        int MAX_STEPS = 10;
        public IList<Position> ExecuteCommnad(ChessPiece chessPiece)
        {
            var positions = new List<Position>();
            for(int i=1;i<=MAX_STEPS;i++)
            {
                positions.Add(new Position(chessPiece.Position.X + i, chessPiece.Position.Y + i));
                positions.Add(new Position(chessPiece.Position.X - i, chessPiece.Position.Y - i));
            }
            return positions;
        }
    }
}
