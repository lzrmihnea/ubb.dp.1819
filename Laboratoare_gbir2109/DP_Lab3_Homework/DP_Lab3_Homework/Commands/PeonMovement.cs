using System;
using System.Collections.Generic;
using System.Text;
using DP_Lab3_Homework.Pieces;

namespace DP_Lab3_Homework.Commands
{
    public class PeonMovement : MovementCommandBase
    {
        public PeonMovement(BoardService service) : base(service) { }

        public override void MovePiece(ChessPiece piece)
        {
            try
            {
                var sign = piece.Color == ChessPieceColor.WHITE ? 1 : -1;
                Console.WriteLine($"Moving Peon to {piece.Position.HorizontalPos + sign},{piece.Position.VerticalPos}");
                boardService.MovePiece(piece, piece.Position.HorizontalPos + sign, piece.Position.VerticalPos);
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
        }
    }
}
