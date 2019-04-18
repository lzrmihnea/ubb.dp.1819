package popa.catalin.lab3.command;

import popa.catalin.lab3.pieces.ChessPiece;
import popa.catalin.lab3.Position;

public class MoveDiagonally implements MovementCommand {
    public MoveDiagonally(DiagonalDirection diagonalDirection) {
        this.diagonalDirection = diagonalDirection;
    }

    private DiagonalDirection diagonalDirection;

    public enum DiagonalDirection {
        ForwardLeft, ForwardRight, BackwardLeft, BackwardRight
    }

    @Override
    public void executeCommand(ChessPiece piece) {
        Position oldPosition = piece.getPosition();
        Position newPosition = null;

        switch (diagonalDirection)
        {
            case ForwardLeft:
                newPosition = new Position(oldPosition.getVertPos() + 1, oldPosition.getHorizPos() - 1);
                break;
            case ForwardRight:
                newPosition = new Position(oldPosition.getVertPos() + 1, oldPosition.getHorizPos() + 1);
                break;
            case BackwardLeft:
                newPosition = new Position(oldPosition.getVertPos() - 1, oldPosition.getHorizPos() - 1);
                break;
            case BackwardRight:
                newPosition = new Position(oldPosition.getVertPos() - 1, oldPosition.getHorizPos() + 1);
                break;
        }

        piece.setPosition(newPosition);
    }
}
