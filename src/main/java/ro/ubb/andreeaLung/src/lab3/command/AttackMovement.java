package lab3.command;

import lab3.pieces.ChessPiece;

public class AttackMovement {
    public void executeCommand(ChessPiece fromPiece, ChessPiece toPiece) {
        if(!fromPiece.isAlive() || !toPiece.isAlive())
            return;
        if(!fromPiece.getColor().equals(toPiece.getColor()))
            toPiece.setAlive(false);
    }
}
