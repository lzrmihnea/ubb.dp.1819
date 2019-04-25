package popa.catalin.lab3.mediator;

import popa.catalin.lab3.command.MoveDiagonally;
import popa.catalin.lab3.command.MoveForward;
import popa.catalin.lab3.command.MoveL;
import popa.catalin.lab3.pieces.Bishop;
import popa.catalin.lab3.pieces.ChessPiece;
import popa.catalin.lab3.Position;
import popa.catalin.lab3.pieces.Horse;
import popa.catalin.lab3.pieces.Peon;

import java.util.HashMap;
import java.util.Map;

public class BoardMediator {

    private Map<Position, ChessPiece> boardMap = new HashMap<>();

    public static void main(String[] args) {
        ChessPiece peon = new Peon(5, 5, true, ChessPiece.ChessPieceColor.BLACK);
        ChessPiece bishop = new Bishop(4, 4, true, ChessPiece.ChessPieceColor.WHITE);
        ChessPiece knight = new Horse(6, 6, true, ChessPiece.ChessPieceColor.BLACK);

        peon.setMovementCommand(new MoveForward());
        bishop.setMovementCommand(new MoveDiagonally(MoveDiagonally.DiagonalDirection.ForwardRight));
        knight.setMovementCommand(new MoveL(MoveL.LDirection.BackwardLeft));


    }
}
