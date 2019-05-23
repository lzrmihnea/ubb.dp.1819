package command;

import pieces.ChessPiece;
import pieces.Position;

import java.util.Random;

public class BishopMove implements MovementCommand {
    public void executeCommand(ChessPiece chessPiece, Position newPosition) {
        Position currentPosition = chessPiece.getPosition();
        if(chessPiece.getColor() == ChessPiece.ChessPieceColor.BLACK) {
            if(currentPosition.getVertPos() != 8 &&
                    currentPosition.getHorizPos() != 1 &&
                    currentPosition.getHorizPos() != 8) {
                int nr = new Random().nextInt(1);
                if(nr == 0) { //move left
                    chessPiece.setPosition(new Position(currentPosition.getVertPos() + 1, currentPosition.getHorizPos() - 1));
                } else { //move right
                    chessPiece.setPosition(new Position(currentPosition.getVertPos() + 1, currentPosition.getHorizPos() + 1));
                }
            }
        } else {
            if(currentPosition.getVertPos() != 1 &&
                    currentPosition.getHorizPos() != 1 &&
                    currentPosition.getHorizPos() != 8) {
                int nr = new Random().nextInt(1);
                if(nr == 0) { //move left
                    chessPiece.setPosition(new Position(currentPosition.getVertPos() - 1, currentPosition.getHorizPos() - 1));
                } else { //move right
                    chessPiece.setPosition(new Position(currentPosition.getVertPos() - 1, currentPosition.getHorizPos() + 1));
                }
            }
        }
    }
}
