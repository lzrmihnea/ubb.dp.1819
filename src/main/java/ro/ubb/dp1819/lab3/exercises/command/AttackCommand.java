package ro.ubb.dp1819.lab3.exercises.command;

import ro.ubb.dp1819.lab3.exercises.pieces.ChessPiece;

public class AttackCommand  {

    public AttackCommand(){}

    public void executeCommand(ChessPiece attackPiece, ChessPiece defendPiece) {
        if (attackPiece.getPosition().getHorizPos() == defendPiece.getPosition().getHorizPos() &&
                attackPiece.getPosition().getVertPos() == defendPiece.getPosition().getVertPos())
            defendPiece.setAlive(false);
    }
}
