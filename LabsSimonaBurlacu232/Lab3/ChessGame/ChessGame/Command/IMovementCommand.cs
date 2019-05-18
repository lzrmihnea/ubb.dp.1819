using ChessGame.Pieces;
using System.Collections.Generic;

namespace ChessGame.Command
{
    public interface IMovementCommand
    {
        IList<Position> ExecuteCommnad(ChessPiece chessPiece);
    }
}
