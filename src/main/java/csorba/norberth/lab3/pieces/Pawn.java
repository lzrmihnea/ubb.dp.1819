package csorba.norberth.lab3.pieces;

import csorba.norberth.lab3.command.MovementCommand;
import csorba.norberth.lab3.command.PawnBasicMove;

public class Pawn extends ChessPiece {
    public Pawn(ChessPieceColor color, Position position) {
        super(color, position);
    }

    @Override
    public MovementCommand getPossibleMove() {
        return new PawnBasicMove(this);
    }
}
