package movement;

import pieces.ChessPiece;

public interface MovementCommand {
    void executeCommand(ChessPiece piece);
}
