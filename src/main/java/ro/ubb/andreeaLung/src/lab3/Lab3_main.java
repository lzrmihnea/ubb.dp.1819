package lab3;

import lab3.command.*;
import lab3.mediator.BoardMediator;
import lab3.pieces.*;

import java.util.HashMap;
import java.util.Map;

public class Lab3_main {
    public static void main(String[] args) {
        Map<ChessPiece, MovementCommand> boardMap = new HashMap<>();
        ChessPiece peon1 = new Peon(new Position(2,1), true, ChessPieceColor.BLACK);
        ChessPiece peon2 = new Peon(new Position(3,2), true, ChessPieceColor.WHITE);
        ChessPiece horse = new Horse(new Position(3,4), true, ChessPieceColor.BLACK);
        ChessPiece bishop = new Bishop(new Position(5,2), true, ChessPieceColor.WHITE);
        boardMap.put(peon1, new PeonBasicMove(Direction.TOP_RIGHT));
        boardMap.put(peon2, new PeonBasicMove(Direction.BOTTOM_RIGHT));
        boardMap.put(horse, new HorseLMovement(Direction.TOP_LEFT));
        boardMap.put(bishop, new BishopDiagonalMovement(3, Direction.BOTTOM_RIGHT));
        BoardMediator boardMediator = new BoardMediator(boardMap);
        AttackMovement attackMovement = new AttackMovement();

        boardMediator.getBoardMap().forEach((piece, command) -> {
            ChessPiece destPiece = boardMediator.getChessPieceOnPos(command.getDestination(piece));
            if(destPiece!=null) {
                attackMovement.executeCommand(piece, destPiece);
                boardMediator.notifyObservers();
            }
            command.executeCommand(piece);
        });
    }
}
