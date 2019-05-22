using DP_Lab3_Homework.Commands;
using DP_Lab3_Homework.Pieces;
using System;
using System.Collections.Generic;
using System.Linq;

namespace DP_Lab3_Homework
{
    class Program
    {
        static int chessBoardSize = 10;
        static int[,] chessBoard = new int[chessBoardSize, chessBoardSize];
        static Random random = new Random((int)new TimeSpan().Ticks);
        static BoardService boardService;

        static void Main(string[] args)
        {
            Console.WriteLine("Hello World!");


            List<ChessPiece> pieces = new List<ChessPiece>();

            InstantiateChessPieces(pieces, ChessPieceColor.WHITE, 3, 3, 3);
            InstantiateChessPieces(pieces, ChessPieceColor.BLACK, 3, 3, 3);

            boardService = new BoardService(pieces, chessBoard, chessBoardSize);
            boardService.Subscribe(new KillCounterObserver());
            boardService.Subscribe(new PrintObserver());
            boardService.Subscribe(new DeathsObserver());

            var turnColor = ChessPieceColor.WHITE;

            for (int i = 0; i < 100; i++)
            {
                PrintBoard();
                turnColor = turnColor == ChessPieceColor.WHITE ? ChessPieceColor.BLACK : ChessPieceColor.WHITE;
                MoveRandomPiece(turnColor, pieces);
            }

            Console.WriteLine(pieces.Count);

            Console.ReadLine();
        }

        private static void InstantiateChessPieces(List<ChessPiece> chessPieces, ChessPieceColor color, int noPeons, int noHorses, int noBishops)
        {
            CreateChessPieces<Peon>(color, noPeons, chessPieces);
            CreateChessPieces<Horse>(color, noHorses, chessPieces);
            CreateChessPieces<Bishop>(color, noBishops, chessPieces);
        }

        private static void CreateChessPieces<T>(ChessPieceColor color, int noPieces, List<ChessPiece> chessPieces) where T : ChessPiece
        {
            for (int i = 0; i < noPieces; i++)
            {
                (int randomX, int randomY) = GenerateRandomPosition();

                if (IsPositionOccupied(randomX, randomY))
                {
                    i--;
                    continue;
                }

                var piece = Activator.CreateInstance(typeof(T), randomY, randomX, true, color) as T;
                chessPieces.Add(piece);
                chessBoard[randomX, randomY] = 1;
            }
        }

        private static bool IsPositionOccupied(int x, int y)
        {
            return chessBoard[x, y] != 0;
        }

        private static (int, int) GenerateRandomPosition()
        {
            var randomX = random.Next(chessBoardSize);
            var randomY = random.Next(chessBoardSize);
            return (randomX, randomY);
        }

        private static void MoveRandomPiece(ChessPieceColor color, List<ChessPiece> pieces)
        {
            MovementCommandBase movement;
            var turnPieces = pieces.Where(p => p.Color == color).ToList();
            var nextPieceIndex = random.Next(turnPieces.Count());
            var nextPiece = turnPieces[nextPieceIndex];
            var nextPieceType = nextPiece.GetType();

            if (nextPieceType == typeof(Peon))
            {
                movement = new PeonMovement(boardService);
            }
            else if (nextPieceType == typeof(Horse))
            {
                movement = new HorseMovement(boardService);
            }
            else
            {
                movement = new BishopMovement(boardService);
            }

            movement.MovePiece(nextPiece);
        }

        private static void PrintBoard()
        {
            for (int i = 0; i < chessBoardSize; i++)
            {
                for (int j = 0; j < chessBoardSize; j++)
                {
                    Console.Write($"{boardService.GetBoard()[i, j]} ");
                }
                Console.WriteLine();
            }
            Console.WriteLine("------------------------------------");
        }
    }
}
