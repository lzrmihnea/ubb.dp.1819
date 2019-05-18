using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ChessGame.Pieces
{
    public class Peon : ChessPiece
    {
        public Peon(Position position, bool isAlive, ChessPieceColor color) : base(position, isAlive, color)
        { }
        
    }
}
