package observer;

import pieces.ChessPiece;
import pieces.Position;

public class KillObserver implements Observer {
    private int blackKilledPieces = 0;
    private int whiteHilledPieces = 0;

    @Override
    public void updateObserver(ChessPiece chessPiece, String action, Position newPosition) {
        if (action == "attack") {
            if (chessPiece.getColor() == ChessPiece.ChessPieceColor.BLACK) {
                blackKilledPieces += 1;
            } else {
                whiteHilledPieces +=1;
            }
            System.out.println(whiteHilledPieces + " white pieces killed");
            System.out.println(blackKilledPieces + " black pieces killed");
        }
    }
}
