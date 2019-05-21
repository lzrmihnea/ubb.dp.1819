package ro.ubb.dp1819.fulea.razvan.lab3.command;


import ro.ubb.dp1819.fulea.razvan.lab3.command.pieces.ChessPiece;
import ro.ubb.dp1819.fulea.razvan.lab3.command.pieces.Position;

public class PeonMovementCommand implements MovementCommand {

    @Override
    public void executeCommand(ChessPiece piece) {
        Position position = piece.getPosition();
        Position oldPosition = new Position(position.getVertPos(), position.getHorizPos());
        if (piece.getColor() == ChessPiece.ChessPieceColor.WHITE) {
            position.setVertPos(position.getVertPos() + 1);
        }
        else {
            position.setVertPos(position.getVertPos() - 1);
        }
        piece.setPosition(position);
        System.out.println("Pawn moving forward 1 space; old position: " + oldPosition + "; new position: " + position);
    }
}
