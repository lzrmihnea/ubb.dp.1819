using DP_Lab3_Homework.Pieces;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace DP_Lab3_Homework
{
    public class BoardService
    {
        int chessBoardSize;
        int[,] chessBoard;
        List<ChessPiece> pieces;
        List<IObserver> observers;

        public BoardService(List<ChessPiece> pieces, int[,] chessBoard, int chessBoardSize)
        {
            this.pieces = pieces;
            this.chessBoard = chessBoard;
            this.chessBoardSize = chessBoardSize;
            observers = new List<IObserver>();
        }

        public void Subscribe(IObserver observer)
        {
            observers.Add(observer);
        }

        public void MovePiece(ChessPiece piece, int newX, int newY)
        {
            if (newX < 0 || newX > chessBoardSize || newY < 0 || newY > chessBoardSize)
            {
                throw new Exception("Position not available");
            }

            if(chessBoard[newX, newY] != 0)
            {
                Attack(piece, newX, newY);
            }

            var oldPiece = pieces.FirstOrDefault(p => p.Position == piece.Position);
            chessBoard[oldPiece.Position.HorizontalPos, oldPiece.Position.VerticalPos] = 0;
            oldPiece.Position = new Position { HorizontalPos = newX, VerticalPos = newY };
            chessBoard[newX, newY] = 1;
        }

        public int[,] GetBoard()
        {
            return chessBoard;
        }

        private void Attack(ChessPiece piece, int newX, int newY)
        {
            var position = new Position { HorizontalPos = newX, VerticalPos = newY };
            pieces.RemoveAll(p => p.Position == position);
            observers.ForEach(o => o.Notify());
        }
    }
}
