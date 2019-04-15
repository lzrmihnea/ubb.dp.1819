package lab3.command;

import lab3.pieces.ChessPiece;
import lab3.pieces.Horse;
import lab3.pieces.Position;

public class HorseLMovement implements MovementCommand {
    Direction direction;

    public HorseLMovement(Direction direction) {
        this.direction = direction;
    }

    @Override
    public void executeCommand(ChessPiece piece) {
        if(!piece.isAlive())
            return;
        piece.setPosition(getDestination(piece));
    }

    @Override
    public Position getDestination(ChessPiece piece) {
        int vert = piece.getPosition().getVertPos();
        int horiz = piece.getPosition().getHorizPos();
        switch (direction) {
            case TOP_LEFT:
                return new Position(vert+2,horiz-1);
            case TOP_RIGHT:
                return new Position(vert+2,horiz+1);
            case BOTTOM_LEFT:
                return new Position(vert-2,horiz-1);
            case BOTTOM_RIGHT:
                return new Position(vert-2,horiz+1);
            default:
                return null;
        }
    }

}
