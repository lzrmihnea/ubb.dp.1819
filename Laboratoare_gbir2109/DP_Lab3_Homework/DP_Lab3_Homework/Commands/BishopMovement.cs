using DP_Lab3_Homework.Pieces;
using System;
using System.Collections.Generic;
using System.Text;

namespace DP_Lab3_Homework.Commands
{
    public class BishopMovement : MovementCommandBase
    {
        public BishopMovement(BoardService service) : base(service) { }

        public override void MovePiece(ChessPiece piece)
        {
            try
            {
                var random = new Random((int)new TimeSpan().Ticks);
                var distanceMovement = random.Next(5);
                var horizMovement = random.Next(100) > 50 ? distanceMovement : -distanceMovement;
                var vertMovement = random.Next(100) > 50 ? distanceMovement : -distanceMovement;
                Console.WriteLine($"Moving Bishop ro {piece.Position.HorizontalPos + horizMovement},{piece.Position.VerticalPos + vertMovement}");

                boardService.MovePiece(piece, piece.Position.HorizontalPos + horizMovement, piece.Position.VerticalPos + vertMovement);
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
        }
    }
}
