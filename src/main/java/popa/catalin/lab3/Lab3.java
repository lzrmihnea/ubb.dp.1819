package popa.catalin.lab3;

import popa.catalin.lab3.command.MoveDiagonally;
import popa.catalin.lab3.command.MoveForward;
import popa.catalin.lab3.command.MoveL;
import popa.catalin.lab3.mediator.BoardMediator;
import popa.catalin.lab3.observer.CIAObserver;
import popa.catalin.lab3.observer.KillCounterObserver;
import popa.catalin.lab3.observer.PrintObserver;
import popa.catalin.lab3.pieces.Bishop;
import popa.catalin.lab3.pieces.ChessPiece;
import popa.catalin.lab3.pieces.Horse;
import popa.catalin.lab3.pieces.Peon;

public class Lab3 {
    public static void main(String[] args) {
        BoardMediator boardMediator = new BoardMediator();

        KillCounterObserver killCounterObserver = new KillCounterObserver();
        boardMediator.attachObserver(killCounterObserver);
        PrintObserver printObserver = new PrintObserver();
        boardMediator.attachObserver(printObserver);
        CIAObserver ciaObserver = new CIAObserver();
        boardMediator.attachObserver(ciaObserver);

        ChessPiece peon = new Peon(5, 5, true, ChessPiece.ChessPieceColor.BLACK);
        ChessPiece bishop = new Bishop(4, 4, true, ChessPiece.ChessPieceColor.WHITE);
        ChessPiece knight = new Horse(6, 6, true, ChessPiece.ChessPieceColor.BLACK);
        boardMediator.addPiece(peon);
        boardMediator.addPiece(bishop);
        boardMediator.addPiece(knight);

        peon.setMovementCommand(new MoveForward());
        bishop.setMovementCommand(new MoveDiagonally(MoveDiagonally.DiagonalDirection.ForwardRight));
        knight.setMovementCommand(new MoveL(MoveL.LDirection.BackwardLeft));

        System.out.println("Before");
        printPieces(killCounterObserver,ciaObserver, peon, bishop);

        bishop.getMovementCommand().executeCommand(bishop);
        knight.getMovementCommand().executeCommand(knight);

        System.out.println("After");
        printPieces(killCounterObserver,ciaObserver, peon, bishop);
    }

    private static void printPieces(KillCounterObserver killCounterObserver,CIAObserver ciaObserver, ChessPiece peon, ChessPiece bishop) {
        System.out.println(peon.getPosition().toString());
        System.out.println(bishop.getPosition().toString());
        System.out.println(killCounterObserver.getValue());
        System.out.println(ciaObserver.getLog());
        System.out.println();
        System.out.println();
    }
}
