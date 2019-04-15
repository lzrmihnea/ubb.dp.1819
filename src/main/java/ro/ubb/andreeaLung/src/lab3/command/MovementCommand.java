package lab3.command;


import lab3.pieces.ChessPiece;
import lab3.pieces.Position;

public interface MovementCommand {

    void executeCommand(ChessPiece piece);
    Position getDestination(ChessPiece piece);
}
