package popa.catalin.lab3.command;

import popa.catalin.lab3.pieces.ChessPiece;
import popa.catalin.lab3.Position;

public class AttackCommand {
    private static Position invalidPosition = new Position(-1, -1);

    public static void attack(ChessPiece attackingPiece, ChessPiece attackedPiece) {
        Position newPosition = attackedPiece.getPosition();
        attackingPiece.setPosition(newPosition);

        attackedPiece.setAlive(false);
        attackedPiece.setPosition(invalidPosition);
    }
}
