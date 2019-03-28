package csorba.norberth.lab3.pieces;

import csorba.norberth.lab3.command.KnightLMove;
import csorba.norberth.lab3.command.MovementCommand;

public class Knight extends ChessPiece {
    public Knight(ChessPieceColor color, Position position) {
        super(color, position);
    }

    @Override
    public MovementCommand getPossibleMove() {
        return new KnightLMove(this);
    }
}
