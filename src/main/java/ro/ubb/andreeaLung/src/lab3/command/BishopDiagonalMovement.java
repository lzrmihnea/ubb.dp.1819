package lab3.command;

import lab3.pieces.Bishop;
import lab3.pieces.ChessPiece;
import lab3.pieces.Position;

public class BishopDiagonalMovement implements MovementCommand {
    Integer distance;
    Direction direction;

    public BishopDiagonalMovement(Integer distance, Direction direction) {
        this.distance = distance;
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
                return new Position(vert+distance,horiz-distance);
            case TOP_RIGHT:
                return new Position(vert+distance,horiz+distance);
            case BOTTOM_LEFT:
                return new Position(vert-distance,horiz-distance);
            case BOTTOM_RIGHT:
                return new Position(vert-distance,horiz+distance);
            default:
                return null;
        }
    }
}
