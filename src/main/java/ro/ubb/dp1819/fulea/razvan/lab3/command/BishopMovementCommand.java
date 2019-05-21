package ro.ubb.dp1819.fulea.razvan.lab3.command;

import ro.ubb.dp1819.fulea.razvan.lab3.command.movement.BishopMovement;
import ro.ubb.dp1819.fulea.razvan.lab3.command.pieces.ChessPiece;
import ro.ubb.dp1819.fulea.razvan.lab3.command.pieces.Position;

public class BishopMovementCommand implements MovementCommand {
    private BishopMovement bishopMovement;

    public BishopMovementCommand(BishopMovement bishopMovement){
        this.bishopMovement = bishopMovement;
    }

    @Override
    public void executeCommand(ChessPiece piece) {
        Position oldPosition = new Position(piece.getPosition().getVertPos(), piece.getPosition().getHorizPos());
        Position nextPos = nextPosition(piece);
        if (nextPos != null) {
            System.out.println("Moving bishop " + bishopMovement.getDirection() + "; oldPosition: " + oldPosition + "; newPosition: " + nextPos);
            piece.setPosition(nextPos);
        } else {
            System.out.println("Cannot move Bishop!");
        }
    }

    private Position nextPosition(ChessPiece piece){
        Position position = null;
        int horizMultiplier = 0;
        int vertMultiplier = 0;
        switch (bishopMovement.getDirection()){
            case FRONT_LEFT:
                horizMultiplier = -1;
                vertMultiplier = 1;
                break;
            case FRONT_RIGHT:
                horizMultiplier = 1;
                vertMultiplier = 1;
                break;
            case BACK_LEFT:
                horizMultiplier = -1;
                vertMultiplier = -1;
                break;
            case BACK_RIGHT:
                horizMultiplier = 1;
                vertMultiplier = -1;
                break;
        }
        int currentHoriz = piece.getPosition().getHorizPos();
        int currentVert = piece.getPosition().getVertPos();
        
        int spaces = bishopMovement.getSpaces();
        int nextHoriz = currentHoriz + (horizMultiplier * spaces);
        int nextVert = currentVert + (vertMultiplier * spaces);

        if ((nextHoriz >= 0 && nextHoriz <= 7) && (nextVert >= 0 && nextVert <= 7)){
            position = new Position(nextVert, nextHoriz);
        }
        return position;
    }
}
