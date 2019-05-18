using ChessGame.Command;
using ChessGame.Observers;
using ChessGame.Pieces;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ChessGame.Mediator
{
    public class Board:IObservable
    {
        public int Dimension { get; set; }
        public List<ChessPiece> ChessPieces { get; set; }
        private readonly List<Tuple<Type, IMovementCommand>> MovementCommands;
        private readonly AttackCommand AttackCommand;
        public readonly IList<IObserver> Observers;

        public Board(int dimension, List<ChessPiece> chessPieces)
        {
            this.Dimension = dimension;
            this.ChessPieces = chessPieces;
            this.MovementCommands = new List<Tuple<Type, IMovementCommand>>
            {
                new Tuple<Type, IMovementCommand>( typeof(Bishop),new BishopDiagonalMovement()),
                new Tuple<Type, IMovementCommand>( typeof(Horse), new HorseLMovement() ),
                new Tuple<Type, IMovementCommand>( typeof(Peon), new PeonAttackMove() ),
                new Tuple<Type, IMovementCommand>(  typeof(Peon), new PeonBasicMove()),
            };
            this.AttackCommand = new AttackCommand();
            this.Observers = new List<IObserver>();
        }
        
        public void Play(int nrMoves)
        {
            var random = new Random();
            while(nrMoves>0)
            {
                var alivePieces = ChessPieces.Where(c => c.IsAlive);
                var randomPiece = alivePieces.ElementAt(random.Next(alivePieces.Count()));

                var commands = MovementCommands.Where(c => c.Item1 == randomPiece.GetType()).Select(c=>c.Item2).ToList();

                var validPositions = GetValidPositions(randomPiece, commands);
                if(validPositions.Count()==0)
                {
                    continue;
                }

                var appliedMove = validPositions.ElementAt(random.Next(validPositions.Count()));
                var existingPiece = PieceAlreadyExists(appliedMove);
                if(existingPiece!=null)
                {
                    AttackCommand.ExecuteCommnad(randomPiece, existingPiece);
                    NotifyAllObservers();
                }
                else
                {
                    randomPiece.Position.X = appliedMove.X;
                    randomPiece.Position.Y = appliedMove.Y;
                }
                nrMoves--;
            }
          
        }


        private IList<Position> GetValidPositions(ChessPiece chessPiece, IList<IMovementCommand> commands)
        {
            var possiblePositions = new List<Position>();
            foreach (var command in commands)
            {
                possiblePositions.AddRange(command.ExecuteCommnad(chessPiece));
            }
            var validPositions = possiblePositions.Where(x => ValidatePosition(x)).ToList();
            if (chessPiece.GetType() == typeof(Peon))
            {
                validPositions = validPositions.Where(p => !(p.Y == chessPiece.Position.Y && PieceAlreadyExists(p) != null)).ToList();
            }
            return validPositions;

        }

        private bool ValidatePosition(Position position)
        {
            return position.X >= 1 && position.X <= Dimension && position.Y >= 1 && position.Y <= Dimension;
        }

        private ChessPiece PieceAlreadyExists(Position position)
        {
           return ChessPieces.Where(c => c.IsAlive && c.Position.X == position.X && c.Position.Y == position.Y).FirstOrDefault();
        }

        public void NotifyAllObservers()
        {
            foreach(var observer in Observers)
            {
                observer.Update();
            }
        }

        public void Attach(IObserver observer)
        {
            Observers.Add(observer);
        }

        public void Dettach(IObserver observer)
        {
            Observers.Remove(observer);
        }

        public int GetNumberPiecesAlive(ChessPieceColor color)
        {
            return ChessPieces.Where(p => p.IsAlive && p.Color == color).Count();
        }
    }
}
