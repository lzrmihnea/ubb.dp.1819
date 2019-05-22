using DP_Lab3_Homework.Pieces;
using System;
using System.Collections.Generic;
using System.Text;

namespace DP_Lab3_Homework.Commands
{
    public abstract class MovementCommandBase
    {
        protected BoardService boardService;

        public MovementCommandBase(BoardService service)
        {
            this.boardService = service;
        }

        public abstract void MovePiece(ChessPiece piece);


    }
}
