package ro.ubb.dp1819.fulea.razvan.lab3.command;

import ro.ubb.dp1819.fulea.razvan.lab3.command.movement.HorseMovement;
import ro.ubb.dp1819.fulea.razvan.lab3.command.pieces.ChessPiece;
import ro.ubb.dp1819.fulea.razvan.lab3.command.pieces.Position;

public class HorseMovementCommand implements MovementCommand {
    private HorseMovement horseMovement;

    public HorseMovementCommand(HorseMovement horseMovement){
        this.horseMovement = horseMovement;
    }

    @Override
    public void executeCommand(ChessPiece piece) {
        Position oldPosition = new Position(piece.getPosition().getVertPos(), piece.getPosition().getHorizPos());
        Position nextPos = nextPosition(piece);
        if (nextPos != null) {
            System.out.println("Moving horse " + horseMovement + "; oldPosition:" + oldPosition + "; newPosition: " + nextPos);
            piece.setPosition(nextPos);
        } else {
            System.out.println("Cannot move horse!");
        }
    }

    private Position nextPosition(ChessPiece piece){
        Position result = null;
        int newHoriz = -1, newVert = -1;
        switch (this.horseMovement){
            case FRONT_LEFT:
                newHoriz = piece.getPosition().getHorizPos() - 1;
                newVert = piece.getPosition().getVertPos() + 2;
                break;
            case FRONT_RIGHT:
                newHoriz = piece.getPosition().getHorizPos() + 1;
                newVert = piece.getPosition().getVertPos() + 2;
                break;
            case RIGHT_FRONT:
                newHoriz = piece.getPosition().getHorizPos() + 2;
                newVert = piece.getPosition().getVertPos() + 1;
                break;
            case RIGHT_BACK:
                newHoriz = piece.getPosition().getHorizPos() + 2;
                newVert = piece.getPosition().getVertPos() - 1;
                break;
            case BACK_RIGHT:
                newHoriz = piece.getPosition().getHorizPos() + 1;
                newVert = piece.getPosition().getVertPos() - 2;
                break;
            case BACK_LEFT:
                newHoriz = piece.getPosition().getHorizPos() - 1;
                newVert = piece.getPosition().getVertPos() - 2;
                break;
            case LEFT_BACK:
                newHoriz = piece.getPosition().getHorizPos() - 2;
                newVert = piece.getPosition().getVertPos() - 1;
                break;
            case LEFT_FRONT:
                newHoriz = piece.getPosition().getHorizPos() - 2;
                newVert = piece.getPosition().getVertPos() + 1;
                break;
            default:
                break;
        }
        if ((newHoriz >= 0 && newHoriz <= 7) && (newVert >= 0 && newVert <= 7)){
            result = new Position(newVert, newHoriz);
        }
        return result;
    }
}
