package csorba.norberth.lab3.pieces;

import csorba.norberth.lab3.command.BishopDiagonalMove;
import csorba.norberth.lab3.command.MovementCommand;

public class Bishop extends ChessPiece {
    public Bishop(ChessPieceColor color, Position position) {
        super(color, position);
    }

    @Override
    public MovementCommand getPossibleMove() {
        return new BishopDiagonalMove(this);
    }
}
