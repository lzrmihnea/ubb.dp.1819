package lab3.command;

import lab3.pieces.ChessPiece;
import lab3.pieces.Peon;
import lab3.pieces.Position;

public class PeonBasicMove implements MovementCommand {
    Direction direction;

    public PeonBasicMove(Direction direction) {
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
                return new Position(vert+1,horiz-1);
            case TOP_RIGHT:
                return new Position(vert+1,horiz+1);
            case BOTTOM_LEFT:
                return new Position(vert-1,horiz-1);
            case BOTTOM_RIGHT:
                return new Position(vert-1,horiz+1);
            default:
                return null;
        }
    }
}
