package popa.catalin.lab3.command;

import popa.catalin.lab3.pieces.ChessPiece;
import popa.catalin.lab3.Position;

public class MoveL extends AbstractCommand {
    public MoveL(LDirection lDirection) {
        this.lDirection = lDirection;
    }

    private LDirection lDirection;

    public enum LDirection {
        ForwardLeft, ForwardRight, BackwardLeft, BackwardRight,
        LeftForward, RightForward, LeftBackward, RightBackward
    }

    @Override
    public Position getResultingPosition(ChessPiece piece) {
        Position oldPosition = piece.getPosition();
        Position newPosition = null;
        switch (lDirection) {
            case ForwardLeft:
                newPosition = new Position(oldPosition.getVertPos() + 2, oldPosition.getHorizPos() - 1);
                break;
            case ForwardRight:
                newPosition = new Position(oldPosition.getVertPos() + 2, oldPosition.getHorizPos() + 1);
                break;
            case BackwardLeft:
                newPosition = new Position(oldPosition.getVertPos() - 2, oldPosition.getHorizPos() - 1);
                break;
            case BackwardRight:
                newPosition = new Position(oldPosition.getVertPos() - 2, oldPosition.getHorizPos() + 1);
            case LeftForward:
                newPosition = new Position(oldPosition.getVertPos() + 1, oldPosition.getHorizPos() - 2);
                break;
            case RightForward:
                newPosition = new Position(oldPosition.getVertPos() + 1, oldPosition.getHorizPos() + 2);
                break;
            case LeftBackward:
                newPosition = new Position(oldPosition.getVertPos() - 1, oldPosition.getHorizPos() - 2);
                break;
            case RightBackward:
                newPosition = new Position(oldPosition.getVertPos() - 1, oldPosition.getHorizPos() + 2);
                break;
        }
        return newPosition;
    }
}
