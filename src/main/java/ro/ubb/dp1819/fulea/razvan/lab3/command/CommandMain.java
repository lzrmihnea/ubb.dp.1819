package ro.ubb.dp1819.fulea.razvan.lab3.command;

import ro.ubb.dp1819.fulea.razvan.lab3.command.movement.BishopMovement;
import ro.ubb.dp1819.fulea.razvan.lab3.command.movement.HorseMovement;
import ro.ubb.dp1819.fulea.razvan.lab3.command.pieces.Bishop;
import ro.ubb.dp1819.fulea.razvan.lab3.command.pieces.ChessPiece;
import ro.ubb.dp1819.fulea.razvan.lab3.command.pieces.Horse;
import ro.ubb.dp1819.fulea.razvan.lab3.command.pieces.Peon;

public class CommandMain {

    public static void run(){
        ChessPiece whitePeon = new Peon(1, 3, true, ChessPiece.ChessPieceColor.WHITE);
        ChessPiece blackPeon = new Peon(7, 3, true, ChessPiece.ChessPieceColor.BLACK);

        PeonMovementCommand peonMovementCommand = new PeonMovementCommand();
        peonMovementCommand.executeCommand(whitePeon);
        peonMovementCommand.executeCommand(blackPeon);

        System.out.println("==================================");

        ChessPiece horse1 = new Horse(4, 7, true, ChessPiece.ChessPieceColor.WHITE);
        ChessPiece horse2 = new Horse(5, 7, true, ChessPiece.ChessPieceColor.BLACK);
        HorseMovementCommand validHorseMove = new HorseMovementCommand(HorseMovement.FRONT_LEFT);
        HorseMovementCommand invalidHorseMove = new HorseMovementCommand(HorseMovement.FRONT_RIGHT);

        validHorseMove.executeCommand(horse1);
        invalidHorseMove.executeCommand(horse2);

        System.out.println("==================================");

        ChessPiece bishop1 = new Bishop(0,0, true, ChessPiece.ChessPieceColor.WHITE);
        ChessPiece bishop2 = new Bishop(1,0, true, ChessPiece.ChessPieceColor.BLACK);
        BishopMovementCommand validBishopMove = new BishopMovementCommand(new BishopMovement(7, BishopMovement.Direction.FRONT_RIGHT));
        BishopMovementCommand invalidBishopMove = new BishopMovementCommand(new BishopMovement(1, BishopMovement.Direction.FRONT_LEFT));
        validBishopMove.executeCommand(bishop1);
        invalidBishopMove.executeCommand(bishop2);
    }

}
