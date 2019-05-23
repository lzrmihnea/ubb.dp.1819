package command;

import pieces.ChessPiece;
import pieces.Position;

import java.util.Random;

public class HorseMove implements  MovementCommand {
    public void executeCommand(ChessPiece chessPiece, Position newPosition) {
        Position currentPosition = chessPiece.getPosition();
        if(chessPiece.getColor() == ChessPiece.ChessPieceColor.BLACK) {
            if (currentPosition.getHorizPos() != 1 &&
                    currentPosition.getHorizPos() != 8 &&
                    currentPosition.getVertPos() <= 6) {
                int nr = new Random().nextInt(1);
                if (nr == 0) { //move left
                    chessPiece.setPosition(new Position(currentPosition.getVertPos() + 2, currentPosition.getHorizPos() - 1));
                } else if (nr == 1) { //move right
                    chessPiece.setPosition(new Position(currentPosition.getVertPos() + 2, currentPosition.getHorizPos() + 1));
                }
            }
        } else {
            if (currentPosition.getHorizPos() != 1 &&
                    currentPosition.getHorizPos() != 8 &&
                    currentPosition.getVertPos() > 2) {
                int nr = new Random().nextInt(1);
                if (nr == 0) { //move left
                    chessPiece.setPosition(new Position(currentPosition.getVertPos() - 2, currentPosition.getHorizPos() - 1));
                } else if (nr == 1) { //move right
                    chessPiece.setPosition(new Position(currentPosition.getVertPos() - 2, currentPosition.getHorizPos() + 1));
                }
            }
        }
    }
}
