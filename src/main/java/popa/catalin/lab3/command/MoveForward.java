package popa.catalin.lab3.command;

import popa.catalin.lab3.pieces.ChessPiece;
import popa.catalin.lab3.Position;

public class MoveForward extends AbstractCommand{
    @Override
    public Position getResultingPosition(ChessPiece piece) {
        Position oldPosition = piece.getPosition();
        return new Position(oldPosition.getVertPos()+1,oldPosition.getHorizPos());
    }
}
