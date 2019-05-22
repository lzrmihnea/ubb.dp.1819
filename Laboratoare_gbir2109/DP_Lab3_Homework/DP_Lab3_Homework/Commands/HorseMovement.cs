using System;
using System.Collections.Generic;
using System.Text;
using DP_Lab3_Homework.Pieces;

namespace DP_Lab3_Homework.Commands
{
    public class HorseMovement : MovementCommandBase
    {
        public HorseMovement(BoardService service) : base(service) { }

        public override void MovePiece(ChessPiece piece)
        {
            try
            {
                var random = new Random((int)new TimeSpan().Ticks);
                var horizMovement = random.Next(100) > 50 ? 2 : -2;
                var vertMovement = random.Next(100) > 50 ? 1 : -1;
                Console.WriteLine($"Moving Horse to {piece.Position.HorizontalPos + horizMovement},{piece.Position.VerticalPos + vertMovement}");

                boardService.MovePiece(piece, piece.Position.HorizontalPos + horizMovement, piece.Position.VerticalPos + vertMovement);
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
        }
    }
}
