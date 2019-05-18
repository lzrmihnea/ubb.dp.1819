using ChessGame.Pieces;
using System.Collections.Generic;

namespace ChessGame.Command
{
    public class PeonBasicMove : IMovementCommand
    {
        public IList<Position> ExecuteCommnad(ChessPiece chessPiece)
        {
            var moveDirection = 1;
            if (chessPiece.Color == ChessPieceColor.BLACK)
                moveDirection = -1;
            return new List<Position> { new Position(chessPiece.Position.X + moveDirection, chessPiece.Position.Y) };
        }
    }
}
