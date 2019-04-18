package popa.catalin.lab3.command;

import popa.catalin.lab3.pieces.ChessPiece;
import popa.catalin.lab3.Position;

public class AttackCommand {
    void executeCommand(ChessPiece attackingPiece, ChessPiece attackedPiece) {
        Position newPosition = attackedPiece.getPosition();
        Position invalidPosition = new Position(-1, -1);
        attackedPiece.setAlive(false);
        attackedPiece.setPosition(invalidPosition);
        attackingPiece.setPosition(newPosition);
    }
}
