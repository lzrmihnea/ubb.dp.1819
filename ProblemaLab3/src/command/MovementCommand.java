package command;

import pieces.ChessPiece;
import pieces.Position;

public interface MovementCommand {
    void executeCommand(ChessPiece piece, Position newPosition);
}
