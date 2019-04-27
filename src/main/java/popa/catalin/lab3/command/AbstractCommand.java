package popa.catalin.lab3.command;

import popa.catalin.lab3.mediator.BoardMediator;
import popa.catalin.lab3.pieces.ChessPiece;

public abstract class AbstractCommand implements MovementCommand {
    // Each movement of a piece is checked to see if there is already a piece there.

    public void executeCommand(ChessPiece piece)
    {
        piece.getBoardMediator().movePiece(piece);
    }
}
