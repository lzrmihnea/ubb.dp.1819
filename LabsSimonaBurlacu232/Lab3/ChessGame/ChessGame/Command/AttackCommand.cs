using ChessGame.Pieces;

namespace ChessGame.Command
{
    public class AttackCommand
    {
        public void ExecuteCommnad(ChessPiece from, ChessPiece to)
        {
            from.Position.X = to.Position.X;
            from.Position.Y = to.Position.Y;
            to.IsAlive = false;
        }
    }
}
