package command;

import pieces.ChessPiece;
import pieces.Peon;
import pieces.Position;

import java.util.Random;

public class PeonMove implements MovementCommand {
    public void executeCommand(ChessPiece chessPiece, Position newPosition) {
        if (chessPiece.getColor() == ChessPiece.ChessPieceColor.BLACK) {
            if(newPosition.getVertPos() < 7 &&
                    newPosition.getHorizPos() >=0 &&
                    newPosition.getHorizPos() <=7)
                chessPiece.setPosition(newPosition);
        } else {
            if(newPosition.getVertPos() > 0 &&
                    newPosition.getHorizPos() >=0 &&
                    newPosition.getHorizPos() <=7)
                chessPiece.setPosition(newPosition);
        }
    }
}
