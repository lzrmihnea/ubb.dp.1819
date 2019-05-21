package ro.ubb.dp1819.fulea.razvan.lab3.command;

import ro.ubb.dp1819.fulea.razvan.lab3.command.pieces.ChessPiece;

public interface MovementCommand {

    void executeCommand(ChessPiece piece);

}
