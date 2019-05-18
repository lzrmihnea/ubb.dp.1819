using System;
using System.Collections.Generic;
using System.Linq;

namespace ChessGame.Pieces
{
    public class PieceGenerator
    {
        public List<ChessPiece> GeneratePieces(int dimension, int numberOfPieces)
        {
            var random = new Random();
            var pieces = new List<ChessPiece>();

            while(numberOfPieces>0)
            {
                var color = ChessPieceColor.BLACK;
                if(random.NextDouble() < 0.5)
                {
                    color = ChessPieceColor.WHITE;
                }

                var startLine = 1;
                var endLine = dimension/2;
                if (color == ChessPieceColor.BLACK)
                {
                    startLine = dimension / 2+1;
                    endLine = dimension;
                }
                var x = random.Next(startLine, endLine);
                var y = random.Next(startLine, dimension);
                if (pieces.Any(p => p.Position.X == x && p.Position.Y == y)) continue;


                var classNumber = random.Next(3);
                //here i could use a factory
                if(classNumber==0)
                {
                    var horse = new Horse(new Position(x, y), true, color);
                  
                    pieces.Add(horse);
                }
                else if(classNumber==1)
                {
                    var bishop = new Bishop(new Position(x, y), true, color);
                    pieces.Add(bishop);
                }
                else
                {
                    var peon = new Peon(new Position(x, y), true, color);
                    pieces.Add(peon);
                }
               
                numberOfPieces--;
            }
            return pieces;
        }
        
    }
}
