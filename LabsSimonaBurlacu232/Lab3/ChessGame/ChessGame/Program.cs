using ChessGame.Mediator;
using ChessGame.Observers;
using ChessGame.Pieces;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ChessGame
{
    class Program
    {
        public const int NR_PIECES = 20;
        public const int DIMENSION = 10;
        public const int NR_MOVES = 10;

        static void Main(string[] args)
        {
            var pieceGenerator = new PieceGenerator();
            var pieces = pieceGenerator.GeneratePieces(NR_PIECES, DIMENSION);

            //mediator
            Board board = new Board(DIMENSION, pieces); 
            foreach(var piece in board.ChessPieces)
            {
                Console.WriteLine(piece.ToString());
            }

            //observers
            var printObserver = new PrintObserver(board);
            printObserver.Subscribe();
            var killObserver = new KillCounterObserver(board);
            killObserver.Subscribe();

            board.Play(NR_MOVES);

            var black = board.GetNumberPiecesAlive(ChessPieceColor.BLACK);
            var white = board.GetNumberPiecesAlive(ChessPieceColor.WHITE);
            Console.WriteLine($" ALIVE WHITE:{white} - ALIVE BLACK {black} GG!");
            Console.ReadKey();
        }
    }
}
