package popa.catalin.lab3.command;

import popa.catalin.lab3.pieces.ChessPiece;
import popa.catalin.lab3.Position;

public class MoveForward implements MovementCommand{
    @Override
    public void executeCommand(ChessPiece piece) {
        Position oldPosition = piece.getPosition();
        Position newPosition = new Position(oldPosition.getVertPos()+1,oldPosition.getHorizPos());
        piece.setPosition(newPosition);
    }
}
